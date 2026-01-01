# Constructors in Java:

A Constructor is a special block of code that is called when an object is instantiated. It is used to initialize the state of the object.

## Key Characteristics:

- Name: Must have the same name as the class.
- Return Type: Does not have a return type (not even void).
- Automatic Call: It is called automatically by the new keyword.

## Types of Constructors:

- Default Constructor: If you don't write any constructor, Java automatically creates a "no-argument" constructor for you.
- Parameterized Constructor: A constructor that accepts arguments to initialize fields with specific values.

## Example

```java

class Student {
    String name;

    // Parameterized Constructor
    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // "new Student()" invokes the constructor
        Student s1 = new Student("Alice");
        s1.display();
    }
}
```
