# Enhanced Switch:

    it's a replacement of many if statements to avoid redundency.

```java
    import java.util.Scanner;
    public class Main {
        public  static void main(String[] args)  {

            // initialize
            Scanner scanner = new Scanner(System.in);
            String day;

            // get the date
            System.out.print("Enter a Date: ");
            day = scanner.next();

            // logic
            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("it's a weekday");
                case "Saturday", "Sanday" ->
                    System.out.println("it's a weekend");
                default ->
                    System.out.println(day + " isn't a day");
            }

        }
    }
```
