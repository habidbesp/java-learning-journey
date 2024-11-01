# Java Learning Journey

Welcome to my **Java Learning Journey** repository!  
This repository contains all the concepts and exercises I've worked on as I start learning Java. I will be updating it regularly as I cover new topics.

## 📚 Topics Covered

Here are the topics I've learned so far:

1. #### Introduction to Java
   - Basic overview of Java and its structure.
   - First "Hello, World!" program.

2. #### Variables
   - Understanding data types: `int`, `double`, `char`, etc.
   - Declaring and using variables.
   - How to assign values to variables.

3. #### Strings
   - Introduction to `String` in Java.
   - Basic string operations: concatenation, length, and common methods.

4. #### Console Input and Output
   - Reading user input using `Scanner`.
   - Printing output to the console with `System.out.println`.
   - Learned how to format strings in Java using methods like `String.format()` and `printf() to create well-structured outputs.

5. #### Random Number Generation
   - Explored how to generate random numbers in Java using the Random class to create random integers for various purposes.

6. #### Operators in Java
   - **Arithmetic Operators**: `+`, `-`, `*`, `/`, and `%`.
   - **Unary Operators**: Pre-increment, post-increment, pre-decrement, and post-decrement.
   - **Comparison Operators**:
      - Logical AND (`&&`)
      - Logical OR (`||`)
      - Logical NOT (`!`)
   - **Operator Precedence**: Operator precedence determines the order in which different operators in an expression are evaluated.
   - **VIP Discount System**: A program designed to demonstrate the use of the operators learned.
   - **Book Lending System**: Program that checks if a student is eligible for a loan based on their student credentials or their proximity to the library.
   - **Sales Ticket Generator**: This code implements a simple sales ticket generator that calculates the total amount for a purchase based on the prices of various items and applies a discount if specified.
   - You can find more examples and exercises in the directory: `Operators/src`.

7. #### Decision Statements
   - `if` and `else` statements.
   - `else if` statement. 
   - Importance of the NOT operator `!` in decision statements.
   - **Ternary operator** `condition ? resultIfTrue : resultIfFalse;`
   - **Nested ternary operator**, (a compact way to evaluate multiple condition expressions).
   - **Switch Statement**: The `switch` statement provides a more efficient and organized way to execute different blocks of code based on the value of a variable. Each case within the `switch` corresponds to a specific value, and a `default` case can be included to handle unexpected values.
   - You can find more examples and exercises in the directory: `DecisionStatements/src`.

8. #### Loops in Java
   - The `while` loop repeatedly executes a block of code as long as a specified condition is true. It checks the condition before executing the loop body, which means the code inside the loop may not run at all if the condition is false from the start.
   - The `do-while` loop is similar to the while loop, but it guarantees that the loop body will be executed at least once. This is because the condition is checked after the execution of the loop body.
   - The `for` loop is used for iterating over a range of values or a collection. It consists of three parts: initialization, condition, and iteration, all specified in a single line. This makes it a compact way to iterate when the number of iterations is known.
   - The `break` statement: it is used to exit a loop or switch statement prematurely. When break is encountered, control is transferred to the statement immediately following the loop or switch, effectively terminating the current iteration. This is useful when you need to stop a loop based on a specific condition.
   - The `continue` statement: it skips the current iteration of a loop and proceeds to the next iteration. When continue is executed, the remaining code within the loop for that iteration is skipped, and the loop's condition is re-evaluated. This is helpful when you want to skip certain conditions without terminating the entire loop.
   - You can find more examples and exercises in the directory: `Loops/src`.

9. ### Arrays
   - **Declaring Arrays**: How to declare arrays in Java and understand their syntax.
   - **Creating Space**: How to create an array with a specific size to store elements.
   - **Iterating with For Loops**: How to iterate through the elements of an array using `for` loops.
   - **Adding Values**: How to assign values to specific positions in an array.
   - You can find more examples and exercises in the directory: `Arrays/src`.

10. ### Matrices (2D Array)
    - **What is a 2D Array (Matrix)**: 2D array, matrix, rows and columns, array of arrays.
    - **How to Declare and Create a 2D Array (Matrix)**: new, allocate memory, rows, columns.
    - **2D Array with Simple Syntax**: shorthand syntax, simple initialization, array literal.
    - **How to iterate Over a 2D Array (Matrix)**: iteration, nested loops, for loop, enhanced for loop, rows and columns.
    - You can find more examples and exercises in the directory: `Matrices/src`.

11. ### Functions
    - **Introduction to Functions**: methods, functions, code block, modularity, reusability.
    - **Basic structure**: public, private, returnType, function name, parameters, function body, return.
    - **Access modifiers**: public, private, protected, access, encapsulation.
    - **Functions with a return value**: int, String, boolean, double, return value, result.
    - **functions** (no return value): void.
    - **Functions with parameters**: arguments, parameters, input, variables.
    - **Recursive functions**: recursion, calls itself, base case, stack overflow.
    - **Best practices for writing functions**: readability, reusability, clean code, clear naming, function size.
    - You can find more examples and exercises in the directory: `Functions/src`.
    
12. ### Classes 
    - **Class and Object Creation**: instance, new keyword.
    - **Constructor and Overloading**: initialize, multiple constructors, flexibility.
    - `this` **Operator**: current object reference, distinguish fields, invoke constructors
    - **Packages**: organization, namespaces, modularity, access control.
    - **Encapsulation**: Private Attributes, access modifiers, getters/setters.
    - **Inheritance**: Superclass, Subclass, Method Overriding, Polymorphism.
    - **Object class**: method `toString()` "method overriding".
    - **Static Context**: static, class variable, static method, static block, accessing static members.
    - You can find more examples and exercises in the directory: `Classes/src`.


13. ### Advanced Topics 
    - **Varargs (Variable-Length Arguments)**: `Ellipsis ( ... ), Flexible parameters, Argument list, Array-like structure, Single varargs rule, Last parameter requirement.
    - **For-each loop**: Enhanced for loop, Array iteration, Syntax (e.g., `for (Type element : collection)`).
    - **Abstract Class**: Abstract Methods, Cannot be instantiated, Polymorphism, Encapsulation, Partial implementation, Method overriding, Contract for subclasses, Template method pattern.
    - **Interfaces**: Abstract type, Method declaration, Multiple inheritance, Contract, Default and Static methods, Polymorphism.
    - **JavaBeans**: Reusable components, No-argument constructor, Encapsulation, Getter and setter methods, Serialization.
    - **Exception Handling**: try, catch, finally block, Runtime exceptions, Error handling,
    - **Collections**: ArrayList, Generics parameterized, Lambda Functions - `forEach()`, `asList()` method.
    - **Set**: No duplicates, Interface, Efficient lookup - `TreeSet` with time complexity of `O(log n)` -, Unordered (general), Key Methods: `add()`, `remove()
    - **Maps**: Key-Value Pairs, No Duplicate Keys, Nullable Values, Methods: put, remove, Separable iteration with `forEach(key, value)`.
    - **Snacks Machine**: A console application to practice various advanced topics.
    - You can find more examples and exercises in the directory: `AdvancedTopics/src`.



## 🛠 Tools and Technologies
- **Java** (JDK 17+)
- **IntelliJ IDEA** (my current IDE)
- **Git** (for version control)

## 🚀 Getting Started

To run any code from this repository:

1. Clone the repository:
    ```bash
    git clone https://github.com/habidbesp/java-learning-journey.git
    ```
2. Open the folder of the topic you want to explore.
3. Run the code using **IntelliJ IDEA** or any other preferred IDE.

## 💡 Next Steps

As I continue learning, I will cover more topics like:
- Object-Oriented Programming.

Stay tuned for more updates!

## 🙋‍♂️ Contact

Feel free to reach out to me if you have any suggestions or feedback.

- **GitHub**: [habidbesp](https://github.com/habidbesp)
- **Contact**: [Visit my Homepage 👉 To contact me!](https://habid-badillo.vercel.app/contact)

Thank you for visiting my repository!
