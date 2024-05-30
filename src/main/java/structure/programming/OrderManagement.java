package structure.programming;


public class OrderManagement {

  DataStore dataStore;

  public OrderManagement(DataStore dataStore) {

    this.dataStore = dataStore;
  }

  void addOrder(Order order) {

    dataStore.orders.add(order);
  }

  void getRoomOrder(int roomNumber) {
    Order selectedOrder = null;
    for(Order order : dataStore.orders) {

      if(order.roomNumber == roomNumber) {

        selectedOrder = order;
      }
    }

    System.out.println("name" + "    " + "description" + "         " + "price");

    for(Meal meal : selectedOrder.meals) {

      System.out.println(meal.name + "\t" + meal.description + "\t\t" + meal.price);
    }
  }
}
