# OverLoaded Methods in Java

    methods that share the same name, but differnet parameters, signature = name + parameters.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(3, 25));
        System.out.println(add(3, 25, 4));
        System.out.println(add(3, 25, 5,12));
    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

}
```
