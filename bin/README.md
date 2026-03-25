# 📚 Java Practice Collection
A growing library of small Java programs that illustrate core language concepts – loops, conditionals, arrays, classes, inheritance, I/O, and more.

Why this repo?
• 100+ self‑contained examples written while learning Java (2018‑2023).
• Ready to copy‑paste, compile, run, or import into any IDE.
• All files are plain .java – no external dependencies or build tools required.

📁 Folder Overview
Folder	Typical Contents / Purpose
bin/	Compiled .class files (generated automatically by javac). No source code lives here.
Class12Project/	Exercises from a 12th‑grade curriculum (e.g., simple programs, loops, conditionals).
for_loop/	Programs that demonstrate for, while, and do‑while loops – e.g., alphabet printing, array iteration.
if-else/	Examples of conditional logic (if/else, switch) plus small utility programs (electricity bill calculator, date converter).
Inheritance/	Basic class hierarchies that show inheritance, method overriding, and simple object models (Account, Bank, etc.).
PYQ/TNTYFIV/	Practice questions from programming contests. Contains the Colsum column‑sum calculator and the Perni binary‑number checker.
switch_case/	Programs that heavily use Java’s switch statement (date converters, menu systems, etc.).
Tip: All source files are plain Java (.java). No external dependencies or build tools required.

⚙️ How to Compile & Run
The following one‑liner compiles every .java file in the repository and places the resulting .class files alongside their sources:

Potentially dangerous command
Bash
Run
find . -name "*.java" | xargs javac
After compilation, run any program by specifying its fully‑qualified class name (the directory path is used as the package prefix because no explicit package statements are present):

Potentially dangerous command
Bash
Run
### Example: run Colsum
cd PYQ/TNTYFIV
java Colsum

### Run a for‑loop example
java for_loop.Alphabets2
Why this stays future‑proof
• Adding new .java files automatically picks them up – no manual edits.
• The run command never changes because it relies only on the file name, not an explicit list.

📖 Program Highlights
Folder	Example	What it teaches
for_loop	Alphabets2.java	Looping over characters.
if-else	electricityBill.java	Conditional logic & user input.
Inheritance	Account.java, Bank.java	Class hierarchy, inheritance, overriding.
switch_case	D_M_Y_Converter.java	Switch‑case with dates and enums.
PYQ/TNTYFIV	Colsum.java	2‑D arrays, column sums, I/O.
Perni.java	Recursion & binary number validation.
Feel free to open any file, modify it, recompile, and see the result instantly.

🚀 Quick Demo: Colsum
Potentially dangerous command
Bash
Run
$ cd PYQ/TNTYFIV
$ javac Colsum.java
$ java Colsum
Enter 12 integers (row-major order):
1 2 3 4
5 6 7 8
9 10 11 12
Column sums:
col 1: 15
col 2: 18
col 3: 21
col 4: 24
📜 License
This repository is released under the MIT license – feel free to copy, modify and use the code for learning or production purposes.