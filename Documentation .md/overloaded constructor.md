Overloaded Constructors in Java
Constructor Overloading is a technique of having more than one constructor with different parameter lists. This allows you to initialize an object in different ways depending on what data you have available.

Rules for Overloading
To overload a constructor, each version must have a unique signature. This means they must differ in:

The number of parameters.

The data types of parameters.

The order of parameters.

Why use it?
It provides flexibility. For example, you might want to create a User object with just a username, or a User with a username and an email.

Code Example

```java

class Product {
    String name;
    double price;
    int stock;

    // Constructor 1: No stock provided (defaults to 0)
    Product(String n, double p) {
        name = n;
        price = p;
        stock = 0;
    }

    // Constructor 2: Everything provided
    Product(String n, double p, int s) {
        name = n;
        price = p;
        stock = s;
    }

    void showDetails() {
        System.out.println(name + " | Price: " + price + " | Stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99); // Uses Constructor 1
        Product p2 = new Product("Mouse", 25.00, 50); // Uses Constructor 2

        p1.showDetails();
        p2.showDetails();
    }
}
```
