import java.util.Scanner;

// Superclass
class BankAccount {
    double balance = 0.0;  // Account balance

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
    }
}

// Subclass inheriting from BankAccount
class SavingsAccount extends BankAccount {

    // Method to add 5% interest to balance
    void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount account = new SavingsAccount();

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        //Deposit amount entered by the user
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        account.deposit(amount);

        //Apply interest
        account.addInterest();

        //Display final balance
        System.out.println("Final balance after interest: " + account.balance);

        input.close();
    }
}

