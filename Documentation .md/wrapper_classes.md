# Wrapper Classes in Java

A **Wrapper Class** is a class that encapsulates a primitive data type into an object. In Java, primitives (like `int`, `double`, etc.) are not objects, which can be a limitation when working with certain Java features that require objects, such as the Collections Framework.

---

### 1. Primitive vs. Wrapper Class

Java provides a corresponding wrapper class for each of the eight primitive data types. All these classes are part of the `java.lang` package.

| Primitive Type | Wrapper Class |
| :------------- | :------------ |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |

---

### 2. Autoboxing and Unboxing

Java simplifies the process of converting between primitives and objects through automatic mechanisms:

- **Autoboxing:** The automatic conversion of a primitive type to its corresponding wrapper object.
- **Unboxing:** The automatic conversion of a wrapper object back to its primitive type.

#### Code Example

```java
public class Main {
    public static void main(String[] args) {
        // Autoboxing: int to Integer
        int primitiveInt = 25;
        Integer wrapperInt = primitiveInt;

        // Unboxing: Integer to int
        Integer wrapperNum = 50;
        int primitiveNum = wrapperNum;

        System.out.println("Wrapper: " + wrapperInt + " | Primitive: " + primitiveNum);
    }
}

```

---

### 3. Why Use Wrapper Classes?

1. **Collections Framework:** Classes like `ArrayList` or `HashMap` cannot store primitives. You must use `ArrayList<Integer>` instead of `ArrayList<int>`.
2. **Null Values:** Primitives cannot be `null`. Wrapper classes allow for `null`, which is useful in database operations or optional values.
3. **Utility Methods:** Wrapper classes provide helpful static methods (e.g., `Integer.parseInt("123")` or `Character.isDigit('5')`).
4. **Generics:** Generics only work with objects, not primitives.

---

### 4. Comparison Summary

| Feature         | Primitive Type     | Wrapper Class            |
| --------------- | ------------------ | ------------------------ |
| **Storage**     | Stack memory       | Heap memory (as Objects) |
| **Performance** | Faster / Efficient | Slower (Object overhead) |
| **Nullability** | Cannot be null     | Can be null              |
| **Methods**     | No methods         | Many utility methods     |

> **Warning:** Be careful when unboxing a `null` wrapper object, as it will throw a `NullPointerException`.
