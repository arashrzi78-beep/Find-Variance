# Find-Variance
SingleLinkedList
# Singly Linked List in Java

## 📌 Overview

This project is a simple implementation of a **Singly Linked List** in Java, a fundamental data structure in Computer Science.

The implementation includes basic operations such as insertion, deletion, searching, and statistical computation (variance).

---

## 🧱 Project Structure

* `Node.java` → Defines the structure of a node 
* `SingleLinkedList.java` → Contains all linked list operations 
* `Main.java` → Demonstrates usage of the linked list 

---

## ⚙️ Features

### 🔹 Insertion Methods

* `addAtFirst(int data)` → Insert at the beginning
* `addAtLast(int data)` → Insert at the end
* `addBetween(int index, int data)` → Insert at a specific position

### 🔹 Utility Methods

* `size()` → Returns the number of elements
* `display()` → Prints the list

### 🔹 Data Operations

* `delete(int key)` → Removes a node by value
* `search(int key)` → Checks if a value exists

### 🔹 Statistical Method

* `findVariance()` → Calculates the variance of all elements in the list

---

## 🧠 How It Works

Each node contains:

* `data` → integer value
* `next` → reference to the next node

The list is managed using a `head` pointer that always points to the first node.

---

## 🚀 Example Usage

```java
SingleLinkedList sll = new SingleLinkedList();

sll.addAtFirst(10);
sll.addAtLast(20);
sll.addAtLast(30);

sll.display();
// Output: 10 -> 20 -> 30 -> null

System.out.println("Size => " + sll.size());

double variance = sll.findVariance();
System.out.println("Variance => " + variance);
```

---

## 🧪 Sample Output

```
Size =>  8
5 -> 3 -> 7 -> 2 -> 6 -> 4 -> 8 -> 3 -> null
Variance =>  4.25
```

---

## ⏱️ Time Complexity

| Operation    | Complexity |
| ------------ | ---------- |
| addAtFirst   | O(1)       |
| addAtLast    | O(n)       |
| addBetween   | O(n)       |
| delete       | O(n)       |
| search       | O(n)       |
| size         | O(n)       |
| findVariance | O(n)       |

---

## 📊 Variance Formula

The variance is calculated using:

Variance = Σ(x - mean)² / n

Where:

* `mean` is the average of all elements
* `n` is the number of elements

---

## ⚠️ Notes

* The list does not use Java built-in collections.
* All operations are implemented manually for learning purposes.
* Variance is calculated as **population variance**.

---

## 🎯 Purpose

This project is designed for:

* Learning data structures
* Practicing Java fundamentals
* Understanding pointer-based structures

---

## 📌 Author

* Your Name

---
