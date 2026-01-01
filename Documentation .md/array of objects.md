# Array of Objects in Java

    An Array of Objects is exactly what it sounds like: an array where each element is a reference to an object rather than a primitive value (like int or double).

## 1. The Two-Step Process

When you create an array of objects, you must remember that Java only allocates space for the references initially. You must then instantiate each individual object.

- Declare and Instantiate the Array: Student[] list = new Student[3]; (Creates 3 empty slots).
- Instantiate the Objects: list[0] = new Student(); (Fills a slot with an actual object).

## 2. Code Example

```java
class Book {
String title;

    Book(String t) {
        this.title = t;
    }

}

public class Main {
public static void main(String[] args) {
// Step 1: Create the array
Book[] library = new Book[2];

        // Step 2: Create the objects for each index
        library[0] = new Book("Java Basics");
        library[1] = new Book("Advanced OOP");

        // Accessing data
        for (Book b : library) {
            System.out.println("Book Title: " + b.title);
        }
    }

}
```
