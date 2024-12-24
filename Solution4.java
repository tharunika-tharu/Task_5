import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        //program which takes the user’s birthdate as input and calculates their age
        Scanner scanner = new Scanner(System.in);
        //User input for date of birth
        System.out.print("Enter your birthdate (YYYY-MM-DD):");
        String dateOfBirth = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(dateOfBirth);
        LocalDate today = LocalDate.now();

        //calculate age
        Period period = Period.between(birthdate, today);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        //display age
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
    }
}
