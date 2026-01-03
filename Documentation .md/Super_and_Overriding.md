# Super Keyword and Method Overriding

These two concepts often go hand-in-hand when dealing with inheritance hierarchies.

### 1. Method Overriding

Method Overriding occurs when a subclass provides a specific implementation for a method already defined in its superclass.

- **Requirement:** The method must have the same name, return type, and parameters.
- **Annotation:** Use `@Override` to tell the compiler you are intentionally overriding a method.

### 2. The `super` Keyword

The `super` keyword refers to the immediate parent class. It is used to:

1. **Call Parent Constructor:** Must be the first line in the subclass constructor.
2. **Access Parent Methods:** Useful if the method was overridden but you still need the original logic.

### 3. Implementation Example

```java
class Vehicle {
    String brand = "Generic";

    void start() {
        System.out.println("The vehicle starts.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        super.start(); // Calls the Parent version
        System.out.println("The car engine roars to life.");
    }

    void displayBrand() {
        System.out.println("Brand: " + super.brand);
    }
}
```
