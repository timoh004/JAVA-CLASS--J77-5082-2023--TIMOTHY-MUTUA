public class TwoDArrayBasic {
    public static void main(String[] args) {
        // (a) Declare and initialize 2D array
        int[][] studentMarks = {
            {80, 70, 90},
            {60, 85, 75},
            {88, 92, 79}
        };
        
        // (b) Print marks in matrix form
        System.out.println("Student Marks Matrix:");
      
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + "\t");
            }
            System.out.println();
        }
        
        // (c) Calculate average of first row (Student 1)
        int firstRowSum = 0;
        for (int j = 0; j < studentMarks[0].length; j++) {
            firstRowSum += studentMarks[0][j];
        }
        double firstRowAverage = (double) firstRowSum / studentMarks[0].length;
        System.out.println("\nAverage marks of Student 1: " + firstRowAverage);
    }
}
