# Sum Calculator with Multithreading

This project is a Java program that calculates the sum of even and odd numbers in an array using multithreading. The program demonstrates the use of threads to perform parallel calculations for efficiency.

---

## Features
- **Sum of Even Numbers**: Calculates the sum of all even numbers in an array.
- **Sum of Odd Numbers**: Calculates the sum of all odd numbers in an array.
- **Multithreading**: Uses Java threads to calculate the sums concurrently, improving performance for large arrays.

---

## Technologies Used
- **Java**: The core programming language used for this project.
- **Multithreading**: Java's `Thread` class is used to create and manage parallel tasks for sum calculation.

---

## How It Works
1. The program defines two methods:
   - `calculateEvenSum`: Calculates the sum of all even numbers in the array.
   - `calculateOddSum`: Calculates the sum of all odd numbers in the array.
2. A main class `SumPrint` is responsible for creating an array of numbers and starting two separate threads:
   - One thread calculates the sum of even numbers.
   - The other thread calculates the sum of odd numbers.
3. The results are printed to the console once the threads have completed their calculations.

---

## Example Input
An example array of numbers is provided in the code:

```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
