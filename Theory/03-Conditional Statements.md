boolean values are `true` and `false` or simply 1 and 0.
```java
int a = 4;

if (a == 4) {
    System.out.println("Ohhh! So a is 4!");
}
```

we use == as conditional operator which returns True or False value.
```java
int a = 4;
int b = 5;
boolean result;
result = a < b; // true
result = a > b; // false
result = a <= 4; // a smaller or equal to 4 - true
result = b >= 6; // b bigger or equal to 6 - false
result = a == b; // a equal to b - false
result = a != b; // a is not equal to b - true
result = a > b || a < b; // Logical or - true
result = 3 < a && a < 6; // Logical and - true
result = !result; // Logical not - false

```

The operator `==` works a bit different on objects than on primitives. When we are using objects and want to check if they are equal, the operator `==` will say if they are the same, if you want to check if they are logically equal, you should use the `equals` method on the object. For example:

```java
String a = new String("Wow");
String b = new String("Wow");
String sameA = a;

boolean r1 = a == b;      // This is false, since a and b are not the same object
boolean r2 = a.equals(b); // This is true, since a and b are logically equals
boolean r3 = a == sameA;  // This is true, since a and same
```

The if - else statement
```java
if (a == b) {
    // if true runs this part or else skips
} else {
    // after the skip of condition it comes here
}
```
we can run the code without {} in if else block if the statement is one line.
There is also one liner way of having if else 
```java
int a =5;
int result = a == 4 ? 1 : 8;
```
the above code also means:
```java
int a = 4;
int result;

if (a == 4) {
    result = 1;
} else {
    result = 8;
}
```


