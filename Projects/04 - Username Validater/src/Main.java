import java.util.Scanner;
public class Main {
    public  static void main(String[] args)  {
        // initialization
        Scanner scanner = new Scanner(System.in);

        String username;
        System.out.print("Please Enter your name: ");
        username = scanner.nextLine();

        // logic
        if (username.length() >= 4 && username.length() <= 12) {
            System.out.println("the username isn't valid must be between 4-12");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("the username must not contain spaces of underscores");
        } else {
            System.out.println("welcome " + username);
        }

        // close the scanner
        scanner.close();
    }
}
