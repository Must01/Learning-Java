# break & continue in Java

    break : break out of the (ex: loop) (exit button)

```java
public class Main {
    public  static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.print(i + " ");
        }
    }
}

// output : 0 1 2 3 4
```

    continue : skip the current iteration of a loop (skip button)

```java
public class Main {
    public  static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}

// output : 0 1 2 3 4 6 7 8 9
```
