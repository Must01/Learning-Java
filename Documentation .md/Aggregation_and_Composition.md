# Aggregation vs. Composition in Java

Both **Aggregation** and **Composition** are subsets of **Association**, representing a "HAS-A" relationship where one class contains a reference to another. The primary difference lies in the **ownership** and the **lifecycle** of the objects.

---

### 1. Aggregation (Weak Association)

Aggregation represents a relationship where the child **can exist independently** of the parent. It is a "part-of" relationship where the parts have their own lifecycle.

- **Ownership:** Weak/Shared.
- **Lifecycle:** If the parent object is destroyed, the child objects **survive**.
- **Example:** A `Department` has `Students`. If the department is closed, the students still exist.

#### Code Example: Aggregation

```java
import java.util.List;
import java.util.ArrayList;

class Student {
    String name;
    Student(String name) { this.name = name; }
}

class Department {
    String name;
    private List<Student> students; // Aggregation

    Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alex");
        List<Student> students = new ArrayList<>();
        students.add(s1);

        Department cs = new Department("CS", students);

        // If we set cs to null, the Student 's1' still exists in memory
        cs = null;
        System.out.println("Student " + s1.name + " still exists.");
    }
}

```

---

### 2. Composition (Strong Association)

Composition is a restricted form of aggregation where the child **cannot exist** without the parent. It represents a "death relationship."

- **Ownership:** Strong/Exclusive.
- **Lifecycle:** If the parent object is destroyed, the child objects are **also destroyed**.
- **Example:** A `House` has `Rooms`. A room cannot exist without the house.

#### Code Example: Composition

```java
class Room {
    String type;
    Room(String type) { this.type = type; }
}

class House {
    private final Room kitchen; // Composition

    House() {
        // The child object is created INSIDE the parent constructor
        this.kitchen = new Room("Kitchen");
    }
}

public class Main {
    public static void main(String[] args) {
        House myHouse = new House();
        // When 'myHouse' is garbage collected, the 'kitchen' Room is also gone.
    }
}

```

---

### Key Differences at a Glance

| Feature          | Aggregation          | Composition                         |
| ---------------- | -------------------- | ----------------------------------- |
| **Relationship** | Weak "HAS-A"         | Strong "HAS-A"                      |
| **Dependency**   | Child is independent | Child is dependent on Parent        |
| **Lifecycle**    | Independent          | Tightly coupled (Parent owns Child) |
| **UML Symbol**   | Hollow Diamond ()    | Filled Diamond ()                   |

```

```
