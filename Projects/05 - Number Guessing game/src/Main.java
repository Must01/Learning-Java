import java.util.Random;
import java.util.Scanner;
public class Main {
    public  static void main(String[] args)  {
        // initialization
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int guess = random.nextInt(1,21);
        int input;
        int attempts= 0;

        // logic
        do {
            System.out.println("Guess a number between 1-20: ");
            input = scanner.nextInt();

            if (input > guess && attempts < 3) {
                System.out.println("your are to heigh");
                attempts++;
                System.out.println("your have only " + ( 3 - attempts ) + " attempts");
            } else if (input < guess && attempts < 3) {
                System.out.println("Your too down");
                attempts++;
                System.out.println("your have only " + (3 - attempts) + " attempts");
            }

        } while (guess != input && attempts < 3);

        if (guess != input) {
            System.out.println("Sad! You have failed.");
        } else {
            System.out.println("congratulations u guessed the number it's: " + input);
        }

        // close the scanner
        scanner.close();
    }
}
