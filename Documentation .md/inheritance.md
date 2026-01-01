# Inheritance in Java

**Inheritance** is a mechanism in which one class (the subclass/child) acquires the properties and behaviors (fields and methods) of another class (the superclass/parent). It is a key pillar of Object-Oriented Programming that promotes **code reusability**.

### 1. Key Terminology

- **Superclass (Parent):** The class whose features are inherited.
- **Subclass (Child):** The class that inherits from the superclass. It can add its own fields and methods in addition to the inherited ones.
- **`extends` Keyword:** Used to create an inheritance relationship.

### 2. The "IS-A" Relationship

Inheritance represents an **IS-A** relationship. For example, a `Dog` **is a** `Animal`. A `Car` **is a** `Vehicle`.

### 3. Types of Inheritance in Java

1.  **Single Inheritance:** One child inherits from one parent.
2.  **Multilevel Inheritance:** A child inherits from a parent, which in turn inherits from another parent (A -> B -> C).
3.  **Hierarchical Inheritance:** Multiple children inherit from a single parent.

> **Note:** Java does **not** support "Multiple Inheritance" (one child inheriting from two parents) through classes to avoid complexity and ambiguity.

### 4. Code Example

```java
// Superclass
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog();

        // Accessing field from Superclass
        myDog.name = "Buddy";

        // Calling method from Superclass
        myDog.eat();

        // Calling method from Subclass
        myDog.bark();
    }
}
```
