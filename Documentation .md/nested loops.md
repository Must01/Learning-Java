# Nested Loops

    Nested Loops: A loop inside another loop used often with matrices or data structure & alogirthms.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        int cols;
        System.out.print("Enter number of cols: ");
        cols = scanner.nextInt();
        String symbol;
        System.out.print("Enter number of symbol: ");
        symbol = scanner.next();

        for (int i=0;i < rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
```
