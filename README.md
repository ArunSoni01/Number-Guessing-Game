# Number-Guessing-Game (Console based)

A console-based number guessing game written in Java, organized into four modular classes: `RandomNumber`, `Guess`, `Hint`, and `Main`. The game gives "Hot" and "Cold" hints to help you guess a randomly generated number between 1 and 100.

---

## 🎮 Game Rules

- The computer randomly selects a number between **1 and 100**.
- After each guess:
  - You get a **"Hot"** hint if your guess is within ±10 of the number.
  - You get a **"Cold"** hint if your guess is more than 10 away.
  - If you guess the number exactly, the game ends with a **"Correct!"** message.
- You have **unlimited attempts** to guess the number.

---

## 🛠️ Requirements

- Java JDK 8 or higher
- Terminal / Command Prompt

---

## 🚀 How to Run

1. Download or clone this repository.
2. Open a terminal in the project folder.
3. Compile the source files:
```bash
    javac RandomNumber.java Guess.java Hint.java Main.java
```
4. Run the game :
```bash
    java Main
```