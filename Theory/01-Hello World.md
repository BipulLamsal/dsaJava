```java
public class Main {
```
Java is object oriented programming language.In Java, every line of code that can actually run needs to be inside a class. This line declares a class named `Main`, which is `public`, that means that any other class can access it.

when we declare a public class, we must declare it inside a file with the same name (Main.java).

```java
public static void main(String[] args) {
```

This is the entry point of our Java program. 

-   `public` again means that anyone can access it.
-   `static` means that **the method is not attached to a specific instance, and it has no " this "**. Makes it class method so that it can be called using class name without creating an object of the class.
-   `void` means that this method doesn't return any value.
-   `main` is the name of the method.

The arguments we get inside the method are the arguments that we will get when running the program with parameters. It's an array of strings. 

```java
System.out.println("This will be printed");
```

-   `System` is a pre-defined class that Java provides us and it holds some useful methods and variables.
-   `out` is a static variable within System that represents the output of your program (stdout).
-   `println` is a method of out that can be used to print a line.