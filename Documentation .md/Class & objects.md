# Objects and Classes in Java

In Java, Classes and Objects are the fundamental building blocks of Object-Oriented Programming. Think of a class as a blueprint and an object as the house built from that blueprint.

## 1. What is a Class?

A class is a template or a blueprint that describes the behaviors (methods) and states (variables) that the object of its type supports. It is a logical entity; it doesn't take up space in memory until an object is created.

## 2. What is an Object?

An object is an instance of a class. It has:

- State: Represented by attributes (variables).
- Behavior: Represented by methods (functions).
- Identity: A unique name/address that distinguishes it from other objects.

## 3. Syntax Example

```java
// The Blueprint (Class)
class Car {
    String color;
    String model;

    void drive() {
        System.out.println("The " + color + " " + model + " is moving.");
    }
}

// The Implementation
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an Object
        myCar.color = "Red";
        myCar.model = "Tesla";
        myCar.drive();
    }
}
```
