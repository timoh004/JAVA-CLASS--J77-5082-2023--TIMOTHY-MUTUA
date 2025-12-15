// Parent class
class Vehicle {
    String brand;   // Vehicle brand
    int year;       // Year of manufacture
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int seats;      // Number of seats in the car
}

// Main class
public class VehicleTest {
    public static void main(String[] args) {

        // Create a Car object
        Car myCar = new Car();

        //Assign values to attributes
        myCar.brand = "Toyota";
        myCar.year = 2023;
        myCar.seats = 5;

       //Print all details
        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
        System.out.println("Seats: " + myCar.seats);
    }
}
