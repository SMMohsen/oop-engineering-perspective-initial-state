package structure.programming;


import java.util.List;
import java.util.Scanner;

public class HMSRunner {

  public static void main(String[] args) {


    // preparing data
    DataStore dataStore = new DataStore();
    RoomManagement roomManagement = new RoomManagement(dataStore);
    MenuManagement menuManagement = new MenuManagement(dataStore);
    OrderManagement orderManagement = new OrderManagement(dataStore);
    CheckoutManagement checkoutManagement = new CheckoutManagement(dataStore);

    Scanner scanner = new Scanner(System.in);

    roomManagement.addRoom(1, 2, 250.0);
    roomManagement.addRoom(2, 1, 350.0);
    roomManagement.addRoom(3, 1, 300.0);
    roomManagement.addRoom(4, 2, 200.0);

    menuManagement.addMeal("rizo", "rice with meat", 300.0);
    menuManagement.addMeal("pasto", "pasta with meat", 330.0);








    // software in action
    System.out.println("Program Start Press Enter to Process");



    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get Available Rooms");
    System.out.println("========================================");

    scanner.nextLine();
    roomManagement.getAvailableRooms();


    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get All Meals");
    System.out.println("========================================");

    scanner.nextLine();
    menuManagement.getAllMeals();

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Customer reserved Room 2 for 3 days");
    System.out.println("========================================");

    scanner.nextLine();
    roomManagement.reserveRoom(2, 3, "ahmed", "11223344");


    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get Available Rooms After Reservation");
    System.out.println("========================================");


    scanner.nextLine();
    roomManagement.getAvailableRooms();

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Customer makes order with Rizo meal for room number 2");
    System.out.println("========================================");

    scanner.nextLine();
    Order order = new Order();
    order.meals = List.of(menuManagement.getMeal("rizo"));
    order.customerName = "ahmed";
    order.roomNumber = 2;
    orderManagement.addOrder(order);


    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Checkout Room");
    System.out.println("========================================");

    scanner.nextLine();
    checkoutManagement.checkoutRoom(2);

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("System frees room number 2");
    System.out.println("========================================");

    scanner.nextLine();
    roomManagement.freeRoom(2);


    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get Available Rooms After Checkout");
    System.out.println("========================================");

    scanner.nextLine();
    roomManagement.getAvailableRooms();


  }
}
