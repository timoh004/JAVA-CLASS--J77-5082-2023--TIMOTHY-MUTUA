public class ShoppingCart {
    public static void main(String[] args) {
        // Initialize array with item prices
        int[] itemPrices = {120, 80, 150, 60, 200, 90};
        
        // 1. Print all item prices
        System.out.println("Item Prices:");
        System.out.println("============");
        for (int i = 0; i < itemPrices.length; i++) {
            System.out.println("Item " + (i + 1) + ": Ksh " + itemPrices[i]);
        }
        
        // 2. Calculate and display total amount
        int total = 0;
        for (int price : itemPrices) {
            total += price;
        }
        System.out.println("\n=======================");
        System.out.println("Total Amount: Ksh " + total);
        System.out.println("=======================");
    }
}
