# BasicCource

An educational Java SE project with simple examples of core language topics.

The project is split into packages: each package demonstrates one topic using small, easy-to-read examples. This makes it convenient for reviewing syntax and practicing how to run individual classes with `main`.

## What's in the project

- `src/variables` - variables and operators.
- `src/conditionals` - branching (`if/else`, `switch`, ternary operator).
- `src/loops` - loops (`for`, `foreach`, `while`).
- `src/arrays` - one-dimensional and two-dimensional arrays.
- `src/inputs` - input handling.
- `src/objects` - OOP basics using the `Person` class.
- `src/packet1` and `src/packet2` - access modifiers and cross-package access.
- `src/Main.java`, `src/App.java` - entry points for running examples.

## Folder structure

- `src` - source code.
- `bin` - compiled `.class` files.
- `lib` - external libraries (if needed).

## How to run

### Option 1: via VS Code

1. Open the project in VS Code.
2. Choose a class that contains `main` (for example, `src/loops/Loop_For.java`).
3. Click `Run` above the `main` method, or run it from `Run and Debug`.

### Option 2: via terminal

From the project root:

```bash
javac -d bin src/Main.java
java -cp bin Main
```

To run a class inside a package, use its fully qualified name, for example:

```bash
javac -d bin src/loops/Loop_For.java
java -cp bin loops.Loop_For
```

## Project goal

Practice and reinforce core Java topics through short, self-contained examples:

- language syntax;
- conditions and loops;
- arrays and input;
- basics of classes, objects, and access modifiers.
