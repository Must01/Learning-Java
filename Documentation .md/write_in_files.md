# Writing to Files in Java

Writing data to a file is a common requirement for saving configurations, logs, or user data. Java provides several ways to write text or binary data to files.

---

### 1. Using `FileWriter` (Simple Text)

The `FileWriter` class is the most straightforward way to write text to a file.

- **Default Behavior:** It overwrites the file if it already exists.
- **Append Mode:** To add data to the end of an existing file instead of overwriting, use `new FileWriter("file.txt", true)`.

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("note.txt")) {
            writer.write("Hello Java!\n");
            writer.write("This is a simple way to write text.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

```

---

### 2. Using `BufferedWriter` (Best for Performance)

Writing to a disk is "expensive" in terms of time. `BufferedWriter` stores characters in a buffer (memory) and writes them to the disk in one large batch, making it much more efficient for multiple write operations.

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            for (int i = 1; i <= 5; i++) {
                bw.write("Line number: " + i);
                bw.newLine(); // Platform-independent newline
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

---

### 3. Using `Files.writeString()` (Modern One-Liner)

If you have a single string and want to write it to a file quickly, the `Files` class in `java.nio.file` is the best choice for Java 11+.

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class NioWrite {
    public static void main(String[] args) {
        try {
            String content = "This is a modern way to write files.";
            Files.writeString(Path.of("modern.txt"), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

---

### 4. Writing Binary Data (FileOutputStream)

If you need to write non-text data (like an image or encrypted bytes), you must use a **Byte Stream**.

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryWrite {
    public static void main(String[] args) {
        String data = "Binary data example";
        try (FileOutputStream fos = new FileOutputStream("data.bin")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

---

### Summary Table: Which Writer to use?

| Class                | Best Use Case                                      | Efficiency       |
| -------------------- | -------------------------------------------------- | ---------------- |
| **FileWriter**       | Writing small amounts of text.                     | Low              |
| **BufferedWriter**   | Writing large amounts of text or many small lines. | High             |
| **PrintWriter**      | Writing formatted text (like `printf`).            | Medium           |
| **FileOutputStream** | Writing binary/raw data (images, etc).             | High (for bytes) |
| **Files.write()**    | Modern, quick file creation and writing.           | High             |

### Critical Pro-Tip: The "Flush"

When using buffered streams, data might stay in the memory buffer and not actually reach the disk if the program crashes. Always use **try-with-resources** because it automatically calls `.close()`, which triggers a `.flush()` to ensure all data is physically written to the file.
