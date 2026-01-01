# The Static Keyword in Java

The `static` keyword is a non-access modifier used for methods and variables. A `static` member belongs to the **class** rather than to a specific **instance** (object).

### 1. Static Variables (Class Variables)

There is only **one copy** of a static variable, regardless of how many objects are created. All objects share this same variable.

- **Usage:** Use static variables for properties that should be common to all objects (like a company name or a universal counter).

### 2. Static Methods

Static methods can be called without creating an instance of the class.

- **Rule:** Static methods can only access other static variables and call other static methods. They **cannot** use `this` or access instance variables directly.

### 3. Implementation Example

```java
class Employee {
    String name;          // Instance variable (Unique to each employee)
    static String company = "TechCorp"; // Static variable (Shared by all)
    static int empCount = 0;

    Employee(String name) {
        this.name = name;
        empCount++; // Increments the shared counter
    }

    static void showCompany() {
        // We can access 'company' because it is static
        System.out.println("All employees work for: " + company);
        System.out.println("Total Employees: " + empCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sarah");
        Employee e2 = new Employee("John");

        // Accessing static method via the Class name
        Employee.showCompany();

        // Changing the static variable affects all objects
        Employee.company = "GlobalTech";
        System.out.println(e1.name + " now works for " + Employee.company);
    }
}
```
