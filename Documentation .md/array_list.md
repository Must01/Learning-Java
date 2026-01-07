# ArrayLists in Java

An **ArrayList** is a resizable-array implementation of the `List` interface. It is part of the **Java Collections Framework** and is essentially a dynamic array that grows and shrinks automatically as you add or remove elements.

---

### 1. Key Features

- **Dynamic Sizing:** Unlike standard arrays, you don't need to specify a size when creating an ArrayList.
- **Ordered Collection:** It maintains the insertion order of elements.
- **Random Access:** You can quickly retrieve any element using its index (constant time $O(1)$).
- **Objects Only:** It can only store objects (references). To store primitives, you must use **Wrapper Classes**.

---

### 2. How it Works Under the Hood

Internally, an `ArrayList` uses a regular Java array to store elements.

1. **Initial Capacity:** It starts with a default capacity (usually 10).
2. **Resizing:** When the internal array becomes full, the `ArrayList` creates a **new, larger array** (typically 1.5x the old size).
3. **Copying:** It copies all existing elements from the old array to the new one using `Arrays.copyOf()`.
4. **Efficiency:** While resizing is slow ($O(n)$), it happens infrequently. Most additions are very fast ($O(1)$ amortized).

---

### 3. Common Methods

| Method                      | Description                                  |
| :-------------------------- | :------------------------------------------- |
| `add(E element)`            | Appends an element to the end of the list.   |
| `add(int index, E element)` | Inserts an element at a specific position.   |
| `get(int index)`            | Returns the element at the specified index.  |
| `set(int index, E element)` | Replaces the element at the specified index. |
| `remove(int index)`         | Removes the element at the specified index.  |
| `size()`                    | Returns the number of elements in the list.  |
| `clear()`                   | Removes all elements from the list.          |

---

### 4. Code Example

```java
import java.util.ArrayList; // Essential import

public class Main {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 3. Accessing and Modifying
        System.out.println("First fruit: " + fruits.get(0)); // Apple
        fruits.set(1, "Blueberry"); // Changes Banana to Blueberry

        // 4. Removing
        fruits.remove(2); // Removes Cherry

        // 5. Iterating
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("Current size: " + fruits.size());
    }
}

```

---

### 5. When to use ArrayList vs. Array

| Feature           | Array                           | ArrayList                      |
| ----------------- | ------------------------------- | ------------------------------ |
| **Size**          | Fixed                           | Dynamic                        |
| **Performance**   | Slightly faster (direct memory) | Slightly slower (method calls) |
| **Primitives**    | Supported                       | Not supported (use Wrappers)   |
| **Functionality** | Minimal (only `.length`)        | Rich (many built-in methods)   |
