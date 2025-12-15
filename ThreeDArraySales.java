public class ThreeDArraySales {
    public static void main(String[] args) {
        // (a) Declare and initialize 3D array
        int[][][] salesData = {
            {   // Branch 1
                {10, 20, 30},  // Month 1
                {15, 25, 35}   // Month 2
            },
            {   // Branch 2
                {5, 10, 15},   // Month 1
                {8, 16, 24}    // Month 2
            }
        };
        
        // (b) Print all elements using 3 nested loops
        System.out.println("SALES DATA FOR ALL BRANCHES");
       
        
        for (int branch = 0; branch < salesData.length; branch++) {
            System.out.println("\nBRANCH " + (branch + 1) + ":");
            for (int month = 0; month < salesData[branch].length; month++) {
                System.out.print("Month " + (month + 1) + ": ");
                for (int product = 0; product < salesData[branch][month].length; product++) {
                    System.out.print("P" + (product + 1) + "=" + 
                                    salesData[branch][month][product] + "  ");
                }
                System.out.println();
            }
        }
        
        // (c) Calculate total sales for Branch 1
        int branch1Total = 0;
        for (int month = 0; month < salesData[0].length; month++) {
            for (int product = 0; product < salesData[0][month].length; product++) {
                branch1Total += salesData[0][month][product];
            }
        }
        
        
        System.out.println("Total sales for Branch 1: " + branch1Total);
       
    }
}