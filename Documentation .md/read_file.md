# Reading Files in Java

Reading data from files is a core task in most applications. Java offers several ways to read files depending on the file size, the type of data (text vs. binary), and the version of Java you are using.

---

### 1. Using `Scanner` (Best for Simple Text)

The `Scanner` class is the most beginner-friendly way to read a file. It is great for parsing tokens (like words or numbers) or reading line-by-line.

- **Pros:** Easy to use, built-in parsing methods (`nextInt()`, `nextLine()`).
- **Cons:** Slower for very large files.

```java
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ScannerRead {
    public static void main(String[] args) {
        try {
            File myFile = new File("data.txt");
            Scanner reader = new Scanner(myFile);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
}

```

---

### 2. Using `BufferedReader` (Best for Performance)

For large text files, `BufferedReader` is the professional choice. It buffers the input to minimize the number of I/O operations, making it significantly faster than `Scanner`.

- **Pros:** High performance, thread-safe.
- **Cons:** Requires more "boilerplate" code (wrapping `FileReader`).

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) {
        // Using try-with-resources to ensure the file closes automatically
        try (BufferedReader br = new BufferedReader(new FileReader("large_data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

---

### 3. Using `Files.readAllLines()` (Modern Java NIO)

Introduced in Java 7/8, the `java.nio.file` package provides a more modern, "one-liner" approach.

- **Best for:** Small to medium files where you want to load everything into a `List` immediately.

```java
import java.nio.file.*;
import java.util.List;
import java.io.IOException;

public class NioRead {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("config.txt");
            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

---

### 4. Summary Table: Which one to choose?

| Method              | Best Use Case                                          | Performance       |
| ------------------- | ------------------------------------------------------ | ----------------- |
| **Scanner**         | Reading formatted data (ints, doubles) or simple text. | Low               |
| **BufferedReader**  | Large text files where performance matters.            | High              |
| **Files (NIO)**     | Short scripts, modern apps, small/medium files.        | Medium            |
| **FileInputStream** | Reading raw bytes (Images, Audio, PDF).                | High (for binary) |

---

### Common Errors to Avoid

1. **Forgetting to close the stream:** Always use `try-with-resources` or manually call `.close()`.
2. **Hardcoding Paths:** Use `Paths.get("folder", "file.txt")` or relative paths to ensure your code works on both Windows and Linux.
3. **Encoding Issues:** By default, Java uses the system's charset. For UTF-8 files, specify the charset: `new Scanner(file, StandardCharsets.UTF_8)`.
