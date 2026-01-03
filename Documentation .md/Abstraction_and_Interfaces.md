# Abstraction: Abstract Classes vs. Interfaces

**Abstraction** is the process of hiding implementation details and showing only the functionality to the user.

### 1. Abstract Classes

A class declared with the `abstract` keyword.

- Can have both **abstract methods** (no body) and **regular methods**.
- Cannot be instantiated (you cannot do `new Animal()`).
- Used when classes share a common identity.

### 2. Interfaces

An interface is a blueprint of a class that only contains abstract methods (until Java 8).

- **Multiple Inheritance:** A class can implement multiple interfaces.
- Represents a **capability** (e.g., `Runnable`, `Swimmable`).

### 3. Implementation Example

```java
// Interface
interface Playable {
    void play(); // Abstract by default
}

// Abstract Class
abstract class Instrument {
    String type;
    abstract void tune(); // No body
}

// Concrete Class
class Guitar extends Instrument implements Playable {
    @Override
    void tune() {
        System.out.println("Tuning the guitar strings...");
    }

    @Override
    public void play() {
        System.out.println("Playing a rock riff!");
    }
}
```
