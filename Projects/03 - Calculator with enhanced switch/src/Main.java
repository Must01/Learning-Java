import java.util.Scanner;
public class Main {
    public  static void main(String[] args)  {
        // initialization
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0; // we put 0 in case the none of the cases worked
        boolean validOperator = true;

        // get inputs
        System.out.print("Enter the first Number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the operator (+,-,*,/,^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second Number: ");
        num2 = scanner.nextDouble();

        // logic
        switch (operator) {
            case '+' ->  result = num1 + num2;
            case '*' ->  result = num1 * num2;
            case '-' ->  result = num1 - num2;
            case '/' ->  {
                if (num2 ==0 ) {
                    System.out.println("Can't divide by zero!");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' ->  result = Math.pow(num1,num2);
            default -> {
                    System.out.println(operator + " that isn't a valid operator");
                    validOperator = false;
            }
        }

        if(validOperator) {
            System.out.printf("Result: %.2f", result);
        }

        // close the scanner
        scanner.close();
    }
}
