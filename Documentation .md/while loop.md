# 🔄 Loops in Java

## 1. **While Loop**

- ✅ Checks the condition **before** executing the block.
- 🔁 If the condition is true, the block runs; otherwise, it skips.
- ⚠️ If the condition is false at the start, the loop may **never run**.

### Example: Asking for a name until it’s not empty

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        // while loop: condition checked first
        while (name.isEmpty()) {
            System.out.print("Please Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.print("Hello " + name);

        scanner.close();
    }
}
```

---

## 2. **Do-While Loop**

- ✅ Executes the block **at least once**, regardless of the condition.
- 🔁 After running once, it checks the condition. If true, it repeats.
- ⚠️ Useful when you want the code to run **at least once** before checking.

### Example: Asking for a name (guaranteed prompt at least once)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        // do-while loop: runs once before checking condition
        do {
            System.out.print("Please Enter your name: ");
            name = scanner.nextLine();
        } while (name.isEmpty());

        System.out.print("Hello " + name);

        scanner.close();
    }
}
```

---

## 📝 Key Differences

| Feature            | `while` loop                     | `do-while` loop                |
| ------------------ | -------------------------------- | ------------------------------ |
| Condition check    | Before block                     | After block                    |
| Minimum executions | 0 times                          | 1 time                         |
| Common use case    | Repeat only if condition is true | Ensure code runs at least once |
