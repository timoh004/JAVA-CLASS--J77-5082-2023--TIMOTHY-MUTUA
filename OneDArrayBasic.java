public class OneDArrayBasic {
    public static void main(String[] args) {
        // (a) Declare and initialize array
        int[] numbers = {5, 10, 15, 20, 25};
        
        // (b) Print all elements using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // (c) Calculate and display sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("\nSum of all elements: " + sum);
    }
}
