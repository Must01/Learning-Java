import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initialization
        Scanner scanner = new Scanner(System.in);

        // variables
        int option;
        double weight;
        double newWeight;

        // intro + get the choice
        System.out.println("Welcome to the Weight Converter Program");
        System.out.println("1 convert Lbs to Kg");
        System.out.println("2 convert Kg to Lbs");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        // logic
        if (option == 1) {
            System.out.print("Enter your weight in Lbs: ");
            weight = scanner.nextDouble();
            newWeight =  weight / 2.20462;
            System.out.printf("your weight is : %.2f Kg", newWeight);
        } else if (option == 2) {
            System.out.print("Enter your weight in Kg: ");
            weight = scanner.nextDouble();
            newWeight =  weight * 2.20462;
            System.out.printf("your weight is : %.2f lbs", newWeight);
        } else {
            System.out.println("That wasn't a valid choice.");
        }
    }
}