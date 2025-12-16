# Variable Scope Class & Local:

    variable scope where a variable can be accessed a simple GuideVariable scope determines where in your code a variable can be seen and used. In Java, variables fall into two main categories: **Class (Field) Scope** and **Local Scope**.

##1. Local Variables (Stack)\* **Location:** Declared **inside** a method or a block of code (like a `for` loop).

- **Scope:** Only exists within the block where it is defined.
- **Rule:** **MUST** be initialized before being used.

##2. Class Variables (Fields) (Heap)\* **Location:** Declared **inside** the class, but **outside** any method.

- **Scope:** Exists for the entire life of the object or the class.
- **Rule:** Automatically given a default value (`0`, `null`, `false`).

---

##💡 Simple ExampleLet's look at one class, `Car`, with both types of variables:

```java
public class Car {
    // 1. Instance Variable (Class Scope) - Belongs to the object.
    // Every car object has its own 'color'. Default value is null.
    String color;

    // 2. Static Variable (Class Scope) - Shared by ALL Car objects.
    // There is only ONE copy of 'wheels'. Default value is 0.
    static int wheels = 4;

    public void startEngine() {
        // 3. Local Variable (Local Scope) - Exists only inside this method.
        int speed = 0;

        // We can use 'color' and 'wheels' here because they are class members.
        System.out.println("The " + color + " car starts.");
    }
    // 'speed' is destroyed here.
}

```

**Summary of Access:**
| Variable | Access Location |
| :--- | :--- |
| `color` | Anywhere in the `Car` class, or via a `Car` object (`myCar.color`). |
| `wheels` | Anywhere in the `Car` class, or via the Class Name (`Car.wheels`). |
| `speed` | **ONLY** inside the `startEngine()` method. |
