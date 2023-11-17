import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store account information
        int number;
        String agency;
        String clientName;
        double balance;

        // Getting account number from user
        System.out.println("Please, enter the Account Number:");
        number = scanner.nextInt(); // Reads an integer from the user
        scanner.nextLine(); // Consumes the newline character after the integer input

        // Getting agency from user
        System.out.println("Please, enter the Agency:");
        agency = scanner.nextLine(); // Reads a line of text (String)

        // Getting client name from user
        System.out.println("Please, enter the Client Name:");
        clientName = scanner.nextLine(); // Reads a line of text (String)

        // Getting balance from user
        System.out.println("Please, enter the Balance:");
        balance = scanner.nextDouble(); // Reads a double (decimal number)

        // Displaying the account information
        System.out.println("Hello " + clientName + ", thank you for creating an account in our bank, your agency is " + agency + ", account " + number + " and your balance " + balance + " is already available for withdrawal.");

        scanner.close(); // Closing the scanner object
    }
}
