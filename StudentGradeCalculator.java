  //J77-5082-2023 Timothy mutua
//Question 3: Student Grade Calculator Program

import java.util.Scanner;

// 1. Student Class
class Student {
    // Attributes
    String name;
    double marks;

    // Constructor to initialize attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}



// 2. GradeCalculator Class

class GradeCalculator {

    // Method to calculate grade based on student marks
    public String calculateGrade(double marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}


// 3. MainApp Class

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Accept user input to create student
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();

        // Create Student object
        Student student = new Student(name, marks);

        // Use GradeCalculator to compute grade
        GradeCalculator calc = new GradeCalculator();
        String grade = calc.calculateGrade(marks);

        // Display details
        student.displayDetails();
        System.out.println("Grade: " + grade);
    }
}