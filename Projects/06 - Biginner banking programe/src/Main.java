import java.util.Scanner;

public class Main {
    // global scanner so can be accessed in all methods
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        // Banking Programme
        // declare variables

        double balance = 0;
        boolean isRunning = true; // either to continue the programme or to close it.
        int choice;

        while (isRunning) {
            // display menu
            System.out.println("--------------------");
            System.out.println("Must-banking program");
            System.out.println("--------------------");
            System.out.println("Menu:");
            System.out.println("1- show your balance");
            System.out.println("2- deposit");
            System.out.println("3- withdraw");
            System.out.println("4- exit");
            System.out.println("--------------------");

            // get and process users choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();

                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println(choice + " isn't a valid choice try again!");
            }
        }

        // Exit Message
        System.out.println("thank u have a nice day 😀⚡");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("--------------------");
        System.out.printf("Your current Balance is: %.2f$ \n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount you want to deposit on your account: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("amount can't be negative");
            return 0;
        };

        return amount;
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount of money u want to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return 0;
        } else if (amount < 0 ) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }


}
