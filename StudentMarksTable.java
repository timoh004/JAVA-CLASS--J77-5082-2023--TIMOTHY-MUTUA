public class StudentMarksTable {
    public static void main(String[] args) {
        // Initialize 2D array with student marks
        int[][] marks = {
            {75, 80, 90},  // Student 1
            {65, 70, 85},  // Student 2
            {88, 92, 81}   // Student 3
        };
        
        // 1. Print marks in table (matrix) form
        System.out.println("STUDENT MARKS TABLE");
        System.out.println("===================");
        System.out.println("Student\tMath\tEnglish\tScience");
        System.out.println("--------------------------------");
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
        
        // 2. Calculate average marks of Student 3
        int student3Sum = 0;
        for (int j = 0; j < marks[2].length; j++) {
            student3Sum += marks[2][j];
        }
        double student3Average = (double) student3Sum / marks[2].length;
        
        System.out.println("\n========================");
        System.out.println("Student 3 Average: " + student3Average);
        System.out.println("========================");
    }
}
