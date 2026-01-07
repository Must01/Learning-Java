# Exception Handling in Java

**Exception Handling** is a powerful mechanism used to handle runtime errors, ensuring that the normal flow of the application is maintained even when something goes wrong.

### 1. The Exception Hierarchy

All exception and error types are subclasses of the **Throwable** class, which is at the top of the hierarchy.

- **Error:** Indicates serious problems that a reasonable application should not try to catch (e.g., `OutOfMemoryError`, `StackOverflowError`).
- **Exception:** Indicates conditions that a program should catch.
  - **Checked Exceptions:** Checked at compile-time (e.g., `IOException`, `SQLException`). You **must** handle or declare them.
  - **Unchecked Exceptions (Runtime):** Not checked at compile-time (e.g., `NullPointerException`, `ArithmeticException`). They usually indicate programming logic errors.

---

### 2. The try-catch-finally Block

This is the traditional way to handle exceptions.

- **try:** Contains the code that might throw an exception.
- **catch:** Contains the code to handle the exception if it occurs.
- **finally:** Contains code that **always** executes, regardless of whether an exception was thrown or caught. Ideal for closing resources (though try-with-resources is now preferred).

```java
public class Main {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Cleanup: Execution finished.");
        }
    }
}
```

````

---

### 3. Try-With-Resources (Modern Approach)

Introduced in Java 7, the **try-with-resources** statement automatically closes resources (like files or database connections) at the end of the statement. The resource must implement the `AutoCloseable` interface.

**Why use it?** It eliminates the need for manual `finally` blocks and prevents resource leaks.

```java
import java.io.*;

public class ResourceExample {
    public void readFile() {
        // Resource is declared inside parentheses
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        // br is automatically closed here!
    }
}

```

---

### 4. Throw vs Throws

- **throw:** Used to **explicitly throw** an exception instance from a method or block.
- **throws:** Used in a **method signature** to declare that this method might throw specific exceptions, passing the responsibility to the caller.

```java
void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
        throw new ArithmeticException("Access denied - Under 18");
    }
}

```

---

### 5. Best Practices for 2026

1. **Catch Specific Exceptions:** Never catch `Exception` or `Throwable` if you can catch a specific one like `FileNotFoundException`.
2. **Don't "Swallow" Exceptions:** Never leave a catch block empty. At least log the error.
3. **Throw Early, Catch Late:** Throw an exception as soon as an error is detected, but catch it at a level where you can actually do something useful about it.
4. **Custom Exceptions:** Create your own exception classes (extending `Exception` or `RuntimeException`) for domain-specific errors to make your code more readable.

```java
class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}
```
````
