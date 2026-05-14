# NovaTech Management System

## Project Overview

NovaTech Management System is a console-based Java application developed as a Minimum Viable Product (MVP) to demonstrate the core Object-Oriented Programming (OOP) concepts learned in:

- V1.0: Introduction to OOP in Java
- V2.0: Core OOP Concepts
- V3.0: Java Inheritance
- V4.0: Java Polymorphism

The system simulates a simple company environment where different employee types such as Developers, Managers, and Interns are managed.

---

#  Features

- Employee management system
- Developer, Manager, and Intern classes
- Encapsulation using getters/setters
- Inheritance hierarchy
- Method Overloading
- Method Overriding
- Runtime Polymorphism
- Static members
- final class and final method usage

---

#  Project Structure

```text
NovaTechManagementSystem/
│
├── Main.java
├── Employee.java
├── Developer.java
├── Manager.java
├── Intern.java
├── Department.java
├── SecuritySystem.java
└── README.md
```

---

#  How to Compile and Run

## Step 1: Open Terminal

Navigate to the project folder.

## Step 2: Compile the Program

```bash
javac *.java
```

## Step 3: Run the Program

```bash
java Main
```

---

#  OOP Concepts Demonstrated

---

# V1.0 & V2.0 — Classes and Objects

## Description
Classes are used as blueprints to create objects.

## File References

| Concept | File | Line |
|---|---|---|
| Employee class creation | Employee.java | Lines 1–90 |
| Developer class creation | Developer.java | Lines 1–40 |
| Manager class creation | Manager.java | Lines 1–35 |
| Object instantiation | Main.java | Lines 6–15 |

---

# V1.0 & V2.0 — Encapsulation

## Description
Private fields are protected using getters and setters.

## File References

| Concept | File | Line |
|---|---|---|
| Private variables | Employee.java | Lines 4–5 |
| Protected variable | Employee.java | Line 8 |
| Getter methods | Employee.java | Lines 30–40 |
| Setter methods | Employee.java | Lines 42–58 |

---

# V3.0 — Inheritance

## Description
The project demonstrates multiple forms of inheritance.

---

## Single Inheritance

| Relationship | File | Line |
|---|---|---|
| Developer extends Employee | Developer.java | Line 1 |
| Manager extends Employee | Manager.java | Line 1 |

---

## Multilevel Inheritance

| Relationship | File | Line |
|---|---|---|
| Intern extends Developer | Intern.java | Line 1 |

---

## Hierarchical Inheritance

| Relationship | File | Line |
|---|---|---|
| Developer and Manager inherit from Employee | Developer.java / Manager.java | Line 1 |

---

# V3.0 — super Keyword

## Description
Used to access parent constructors and methods.

| Usage | File | Line |
|---|---|---|
| super(id, name, salary) | Developer.java | Line 10 |
| super.displayInfo() | Developer.java | Line 25 |
| super(id, name, salary) | Manager.java | Line 9 |

---

# V3.0 — this Keyword

## Description
Used to refer to the current object.

| Usage | File | Line |
|---|---|---|
| this.id = id | Employee.java | Line 20 |
| this.name = name | Employee.java | Line 21 |
| this.salary = salary | Employee.java | Line 22 |

---

# V3.0 — Protected Access Modifier

## Description
The protected keyword allows subclasses to access inherited data.

| Usage | File | Line |
|---|---|---|
| protected double salary | Employee.java | Line 8 |

---

# V3.0 — final Class and final Method

## Description
Demonstrates restricted inheritance and overriding.

| Concept | File | Line |
|---|---|---|
| final class Department | Department.java | Line 1 |
| final method companyPolicy() | Employee.java | Line 76 |

---

# V4.0 — Method Overriding (Runtime Polymorphism)

## Description
Subclasses override parent methods.

| Method | File | Line |
|---|---|---|
| displayInfo() override | Developer.java | Lines 21–28 |
| displayInfo() override | Manager.java | Lines 15–22 |
| displayInfo() override | Intern.java | Lines 18–25 |

---

# V4.0 — Method Overloading (Compile-Time Polymorphism)

## Description
Methods with the same name but different parameters.

| Method | File | Line |
|---|---|---|
| work() | Employee.java | Lines 61–63 |
| work(int hours) | Employee.java | Lines 65–67 |
| login(String username) | SecuritySystem.java | Lines 3–5 |
| login(String username, String password) | SecuritySystem.java | Lines 8–10 |

---

# V4.0 — Runtime Polymorphism / Upcasting

## Description
Superclass references store subclass objects.

| Usage | File | Line |
|---|---|---|
| Employee emp = new Developer(...) | Main.java | Line 32 |
| Employee emp = new Manager(...) | Main.java | Line 37 |

---

# V2.0 — Static Members

## Description
Static variables and methods belong to the class rather than objects.

| Usage | File | Line |
|---|---|---|
| static int employeeCount | Employee.java | Line 11 |
| static totalEmployees() | Employee.java | Lines 81–83 |

---

# 📷 Sample Output

```text
Employee ID: 101
Employee Name: Kidus
Salary: $5000.0
Programming Language: Java

Employee ID: 201
Employee Name: Abel
Salary: $8000.0
Department: IT
```

---

#  Project Objectives Achieved

 Classes and Objects  
 Encapsulation  
 Inheritance  
 Single Inheritance  
 Multilevel Inheritance  
 Hierarchical Inheritance  
 Method Overloading  
 Method Overriding  
 Runtime Polymorphism  
 this Keyword  
 super Keyword  
 final Class  
 final Method  
 Static Members  
 Access Modifiers  

---

#  Author

Kidus Dereje  
Java OOP MVP Project  
2026
