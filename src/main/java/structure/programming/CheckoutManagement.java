package structure.programming;

public class CheckoutManagement {

  DataStore dataStore;

  CheckoutManagement(DataStore dataStore) {

    this.dataStore = dataStore;
  }

  void checkoutRoom(int roomNumber) {

    Room selectedRoom = null;
    for(Room room : dataStore.rooms) {

      if(room.number == roomNumber) {
        selectedRoom = room;
      }
    }

    double totalPrice = selectedRoom.reservationStartDate.until(selectedRoom.reservationEndDate).getDays() * selectedRoom.price;

    Order selectedOrder = null;
    for(Order order : dataStore.orders) {

      if(order.roomNumber == roomNumber) {

        selectedOrder = order;
      }
    }

    double orderPrice = 0;
    for(Meal meal : selectedOrder.meals) {

      orderPrice += meal.price;
    }

    totalPrice += orderPrice;

    System.out.println("Thanks Mr/ " + selectedRoom.customerName + " your total price is " + totalPrice + " EGP");
  }
}
