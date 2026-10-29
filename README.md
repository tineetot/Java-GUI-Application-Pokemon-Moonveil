# Pokémon: Moonveil 🌙

A Pokémon-themed Java desktop application with user registration, login, profile settings, and a Pokédex-style dashboard.

## About the Project

**Pokémon: Moonveil** was developed for **Intermediate Programming (Java)** during my **2nd Term** as a **BSIT-MWA student at National University – MOA**.

Built with **Java Swing**, the application combines a custom interface with account management and Pokémon browsing. Its design uses a light and dark blue palette inspired by the Moonveil theme.

## Features

- **Registration and Login** — Create an account and log in with input validation for required fields, password length, matching passwords, and acceptance of terms.
- **Pokédex Dashboard** — Browse Ditto, Mewtwo, and Lunala and view their HP, Attack, Defense, and special stats.
- **Profile Settings** — Update your first name, last name, and username, with changes reflected across the application.
- **Custom Interface** — Navigate between screens through a consistent Pokémon-themed layout.

## Technology

- **Java** — Application logic and object-oriented programming.
- **Java Swing** — Desktop interface components and event handling.

## File Structure

| File | Purpose |
| --- | --- |
| `Main.java` | Starts the application and manages screen switching and shared data. |
| `SignUp.java` | Handles registration and input validation. |
| `LogIn.java` | Handles login and credential validation. |
| `Home.java` | Displays the Pokémon dashboard and navigation. |
| `Settings.java` | Handles profile updates. |
| `User.java` | Stores user account information. |

## How to Run

1. Install the **Java Development Kit (JDK)**.
2. Clone the repository:

   ```bash
   git clone https://github.com/tineetot/Java-GUI-Application-Pokemon-Moonveil.git
   cd Java-GUI-Application-Pokemon-Moonveil
   ```

3. Open the project in your preferred Java IDE, such as **VS Code**, **IntelliJ IDEA**, or **NetBeans**.
4. Ensure the required images, including `PokemonLogo.png` and the Pokémon images, are in the root folder expected by the application.
5. Run `Main.java`.

If all Java source files are in the root folder and have no package declarations, you can also compile and run them from the terminal:

```bash
javac *.java
java Main
```

## What I Learned

Through this project, I practiced:

- Building desktop interfaces with Java Swing.
- Handling button clicks and other user events.
- Validating form inputs.
- Using classes and objects to organize account data.
- Sharing data and managing navigation between screens.
