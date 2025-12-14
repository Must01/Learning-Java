import java.util.Scanner;
public class Main {
    public  static void main(String[] args)  {
        // Initialization
        Scanner scanner = new Scanner(System.in);

        // variables
        String choice;
        double temp;
        double newTemp;

        // get the user temp:
        System.out.println("Enter Temperature: ");
        temp = scanner.nextInt();

        // get the choice
        System.out.println("convert to Fahrenheit & Celsius (f or c):");
        choice = scanner.next().toUpperCase();

        // convert & print it out
        newTemp = (choice.equals("C")) ? (temp * 1.8) + 32  : (temp - 32) * 5 / 9;
        System.out.printf("Your new temp is: %.2f °%s", newTemp , choice );

        // close the scanner
        scanner.close();
    }
}
