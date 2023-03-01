Not all types in java are objects. It is built on top of basic variable types called primitives.
Here is a list of all primitives in Java:

-   `byte` (number, 1 byte)
-   `short` (number, 2 bytes)
-   `int` (number, 4 bytes)
-   `long` (number, 8 bytes)
-   `float` (float number, 4 bytes)
-   `double` (float number, 8 bytes)
-   `char` (a character, 2 bytes)
-   `boolean` (true or false, 1 byte)

Java is a strong typed language, which means variables need to be defined before we use them

To declare and assign a number use the following syntax:
```java
int myNumber;
double d;
myNumber = 5;
d=3.0;
float f =(float) 4.5;
float f = 4.5f;
char c = 'g';
```

float should be cast declaring float f=2.1 would result in loss of precision. Hence, Java forces you to do the casting **to make sure you are declaring a float variable**.

### String
`String` is not a primitive. It's a real type, but Java has special treatment for String.

```java
// Create a string with a constructor
String s1 = new String("Who let the dogs out?");        // String object stored in heap memory
// Just using "" creates a string, so no need to write it the previous way.
String s2 = "Who who who who!";                         // String literal stored in String pool
// Java defined the operator + on strings to concatenate:
String s3 = s1 + s2;
```

*Constructor in java is **used to create the instance of the class**. Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type. Sometimes constructors are also referred to as special methods to initialize an object.*
