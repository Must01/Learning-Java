# The toString() Method

In Java, every class automatically inherits from the `Object` class. The `toString()` method is a member of that class.

### 1. Why Override toString()?

By default, `toString()` returns the class name followed by the memory address (hashcode). Overriding it allows you to return a meaningful string representation of an object's data.

### 2. Implementation Example

```java
class User {
    String username;
    String email;

    User(String u, String e) {
        this.username = u;
        this.email = e;
    }

    @Override
    public String toString() {
        return "User [Username: " + username + ", Email: " + email + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Dev_Jane", "jane@example.com");

        // This automatically calls user1.toString()
        System.out.println(user1);
    }
}
```
