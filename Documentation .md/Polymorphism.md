## **Polymorphism** is one of the core pillars of Object-Oriented Programming (OOP). The term comes from the Greek words _poly_ (many) and _morph_ (form). In Java, it allows an object to take on many forms, typically by using a parent class reference to refer to a child class object.

### 1. Types of Polymorphism

Polymorphism in Java is divided into two categories based on **when** the method call is resolved.

#### A. Static Polymorphism (Compile-time)

Also known as **Method Overloading**. The compiler determines which method to execute based on the method signature (the number and type of arguments).

- **When it happens:** During compilation.
- **Example:** Having multiple methods named `add()` but with different parameters (e.g., `add(int, int)` and `add(double, double)`).

#### B. Dynamic Polymorphism (Runtime)

Also known as **Method Overriding**. This occurs when a subclass provides a specific implementation of a method already defined in its parent class.

- **When it happens:** During execution (Runtime).
- **Mechanism:** **Upcasting**. A parent class reference points to a child class object.
- **Example:** A `Shape` reference pointing to a `Circle` object and calling the `draw()` method.

---

### 2. Upcasting and the "IS-A" Relationship

Upcasting is the foundation of Runtime Polymorphism. It allows you to treat a specific object as a more general type.

```java
Animal myDog = new Dog(); // Upcasting: Dog "is an" Animal
```

## 3. Implementation

ExampleThe following code demonstrates how a single reference type (SoundDevice) can trigger different behaviors depending on the object it currently holds.

```Java
class SoundDevice {
    void makeSound() {
        System.out.println("Some generic sound...");
    }
}

class Radio extends SoundDevice {
    @Override
    void makeSound() {
        System.out.println("Playing music FM 101.5");
    }
}

class Alarm extends SoundDevice {
    @Override
    void makeSound() {
        System.out.println("Beep! Beep! Wake up!");
    }
}

public class Main {
    public static void main(String[] args) {
        // One reference (SoundDevice), multiple forms (Radio, Alarm)
        SoundDevice myDevice;

        myDevice = new Radio();
        myDevice.makeSound(); // Output: Playing music FM 101.5

        myDevice = new Alarm();
        myDevice.makeSound(); // Output: Beep! Beep! Wake up!
    }
}
```

## 4. Benefits of PolymorphismCode Reusability:

You can write a single method that accepts a Parent type and it will work with all existing and future Child classes.Extensibility: New subclasses can be added to a system without changing the existing code that handles the Parent type.Cleanliness: It reduces the need for long switch or if-else blocks to check object types
