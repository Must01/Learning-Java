# Understanding Arrays in Java

An array is a fixed-size data structure that holds a collection of elements of the same type. It is one of the most fundamental structures in Java, providing efficient access to data via indexing.

## 1. Array Basics

- **Fixed Size:** Once an array is created, its length cannot be changed.
- **Zero-indexed:** The first element is at index `0`, and the last is at `length - 1`.
- **Type Safety:** An array can only hold elements of its declared type (e.g., `int[]` can only hold integers).

### Declaration and Initialization

```java
// Declaration and allocation
int[] numbers = new int[5];

// Literal initialization
String[] fruits = {"Apple", "Banana", "Cherry"};

```

---

## 2. Common Array Operations

### Accessing Elements

Elements are accessed using the square bracket notation `[]`.

```java
int firstElement = numbers[0]; // Access
numbers[1] = 10;               // Assignment

```

### Finding Length

Unlike some other languages, `length` is a **property** of an array, not a method.

```java
int size = fruits.length; // Returns 3

```

---

## 3. Essential Array Methods (`java.util.Arrays`)

Since standard arrays have limited built-in functionality, Java provides the `java.util.Arrays` utility class to perform common tasks.

### `Arrays.toString()`

Used to get a readable string representation of an array (otherwise, printing an array object shows its memory address).

```java
int[] vals = {1, 2, 3};
System.out.println(Arrays.toString(vals)); // Output: [1, 2, 3]

```

### `Arrays.sort()`

Sorts the specified array into ascending numerical or alphabetical order.

```java
int[] unsorted = {5, 2, 8, 1};
Arrays.sort(unsorted); // Array is now {1, 2, 5, 8}

```

### `Arrays.binarySearch()`

Searches for a specific value using the binary search algorithm.

> **Note:** The array **must** be sorted first.

```java
int index = Arrays.binarySearch(unsorted, 5); // Returns 2

```

### `Arrays.copyOf()`

Creates a new array by copying an existing one, allowing you to effectively "resize" by creating a larger copy.

```java
int[] biggerArray = Arrays.copyOf(numbers, 10); // Copies original and pads with 0s

```

---

## 4. Multi-dimensional Arrays

A 2D array is essentially an "array of arrays."

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

// Accessing row 1, column 2 (value 6)
int val = matrix[1][2];

```

---

## Summary Table

| Method              | Description                                          |
| ------------------- | ---------------------------------------------------- |
| `length`            | Property that returns the number of elements.        |
| `Arrays.toString()` | Converts array to a readable String.                 |
| `Arrays.sort()`     | Sorts the array in place.                            |
| `Arrays.equals()`   | Checks if two arrays are equal in content and order. |
| `Arrays.fill()`     | Assigns a specific value to every element.           |

```

```
