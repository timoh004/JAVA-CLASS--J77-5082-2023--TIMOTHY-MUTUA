public class WarehouseStock {
    public static void main(String[] args) {
        // Initialize 3D array with warehouse stock data
        int[][][] stock = {
            {   // Warehouse 1
                {50, 30, 20},  // Section 1
                {40, 25, 15}   // Section 2
            },
            {   // Warehouse 2
                {60, 35, 25},  // Section 1
                {55, 28, 18}   // Section 2
            }
        };
        
        // 1. Print all stock values using 3 nested loops
        System.out.println("WAREHOUSE STOCK INVENTORY");
        
        
        for (int warehouse = 0; warehouse < stock.length; warehouse++) {
            System.out.println("\nWAREHOUSE " + (warehouse + 1) + ":");
            for (int section = 0; section < stock[warehouse].length; section++) {
                System.out.print("Section " + (section + 1) + " [");
                for (int product = 0; product < stock[warehouse][section].length; product++) {
                    System.out.print("P" + (product + 1) + ":" + 
                                    stock[warehouse][section][product]);
                    if (product < stock[warehouse][section].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
        
        // 2. Calculate total stock in Warehouse 2
        int warehouse2Total = 0;
        for (int section = 0; section < stock[1].length; section++) {
            for (int product = 0; product < stock[1][section].length; product++) {
                warehouse2Total += stock[1][section][product];
            }
        }
    
        System.out.println("Total stock in Warehouse 2: " + warehouse2Total + " units");
       
    }
}