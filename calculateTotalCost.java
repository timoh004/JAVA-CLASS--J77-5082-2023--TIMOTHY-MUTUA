//J77-5082-2023 Timothy Mutua
//java program to calculate total cost of a vacation
public class VacationCost {

    // Method to calculate total vacation cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodation = 850.50;
        double meals = 400.25;
        double activities = 200.00;
        //calling the method to calculate total cost
        double totalCost = calculateTotalCost(accommodation, meals, activities);

        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}