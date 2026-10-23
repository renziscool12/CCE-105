# java-game-character

#  Game Character Manager in Java

A simple Java project demonstrating **Data Abstraction, Object-Oriented Programming (OOP), and Stack ADT** using game characters inspired by Gojo Satoru and Ryomen Sukuna.

---

##  What is Data Abstraction?

- **Abstraction** hides implementation details and shows only the essential features.
- In Java, abstraction can be implemented using **abstract classes** and **interfaces**.
- It allows us to define what an object does while subclasses provide their own implementations.

---

## 🐾 Example: Game Characters with Abstraction

We define an abstract class `GameCharacter` that contains common attributes such as `name`, `health`, and `attackPower`.

Each character implements its own methods:

- `attack()` – Performs an attack.
- `specialMove()` – Uses a unique special ability.
- `takeDamage()` – Reduces the character's health.

### Character Classes

- **Gojo** – Uses Infinity.
- **Sukuna** – Uses Malevolent Shrine.
- **Warrior** – Uses Shield Bash.
- **Mage** – Uses magical attacks and Meteor Strike.

---

##  Stack Abstract Data Type (ADT)

The project uses Java's `Stack<GameCharacter>` to store and manage game characters.

- `push()` – Adds a character to the stack.
- `peek()` – Gets the character at the top without removing it.
- `pop()` – Removes the character at the top.
- `isEmpty()` – Checks whether the stack contains characters.

---

##  Graphical User Interface

The project includes a Java Swing GUI that allows users to interact with the character stack through buttons.

- Add Gojo, Sukuna, Warrior, or Mage.
- View character names, health, and attack power.
- Perform actions on the top character.
- Remove the top character from the stack.

---

##  Sample Output

```text
Gojo Satoru added!

Gojo Satoru | Health: 100 | Attack: 50

Gojo Satoru attacks!
Damage: 50

Gojo Satoru removed from the stack!
```

---

##  Technologies Used

- Java
- Java Swing
- Object-Oriented Programming (OOP)
- Stack Abstract Data Type (ADT)

---

##  Summary

- **Abstraction** defines essential behaviors while hiding implementation details.
- **Inheritance** allows character classes to extend `GameCharacter`.
- **Polymorphism** allows different character types to implement their own behaviors.
- **Stack ADT** manages characters using LIFO (Last In, First Out).
- **Java Swing** provides a graphical interface for interacting with characters.

This project demonstrates basic Java programming concepts through a simple game character management application.
