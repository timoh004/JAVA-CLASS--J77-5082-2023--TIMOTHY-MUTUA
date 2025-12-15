import java.util.Scanner;

// Superclass
class Employee {
    String name;        // Employee name
    double salary;      // Employee salary

    // Method to display employee information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass inheriting from Employee
class Lecturer extends Employee {
    String department;  // Lecturer department

    // Overriding displayInfo() method
    @Override
    void displayInfo() {
        // Calling parent class method
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class
public class UniversityTest {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Step 1: Accept user input
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        input.nextLine(); // Clear buffer

        System.out.print("Enter department: ");
        String department = input.nextLine();

        // Step 2: Create Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.name = name;
        lecturer.salary = salary;
        lecturer.department = department;

        // Step 3: Display all information
        System.out.println("\nLecturer Information:");
        lecturer.displayInfo();

        input.close();
    }
}
