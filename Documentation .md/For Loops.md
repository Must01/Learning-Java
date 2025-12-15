# For Loops in Java

    execute some code a certain amount of times

```java
import java.util.Scanner;
public class Main {
    public  static void main(String[] args) throws InterruptedException {
        // initialization
        Scanner scanner = new Scanner(System.in);
        System.out.print("How Many Seconds to countdown from: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // make the program sleep for 1k milisecond in each loop
        }

        System.out.println("Glad of u never stop learning!");

        // close the scanner
        scanner.close();
    }
}
```
