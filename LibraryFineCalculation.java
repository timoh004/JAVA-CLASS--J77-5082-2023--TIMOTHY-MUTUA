// J77-5082-2023  TIMOTHY MUTUA
//Programme to take bookID,dueDAate and returnDate  as input and display bookID,dueDate,returnDate,daysOverdue,fineRate and fineAmount.
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Due Date (yyyy-MM-dd): ");
        String dueDateStr = scanner.nextLine();
        System.out.print("Enter Return Date (yyyy-MM-dd): ");
        String returnDateStr = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dueDateStr, formatter);
        LocalDate returnDate = LocalDate.parse(returnDateStr, formatter);
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, returnDate);
        daysOverdue = daysOverdue > 0 ? daysOverdue : 0;

        int fineRate;
        if (daysOverdue == 0) {
            fineRate = 0;
        } else if (daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue <= 14) {
            fineRate = 50;
        } else {
            fineRate = 100;
        }
        long fineAmount = daysOverdue * fineRate;

        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate (Ksh. per day): " + fineRate);
        System.out.println("Fine Amount (Ksh.): " + fineAmount);
    }
}