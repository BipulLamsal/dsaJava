Arrays in java are also called objects. They need to be declared and then created. 
```java
int[] arr;
arr = new int[10]
```
The length of the array can be obtained with .lenth method

```java
System.out.println(arr.length);
```

To access or set particular list of value in java we need to start from 0.
simply,
```java
int[] arr = new int[5];
//accesses and sets the first element
arr[0] = 4;
// it can also be assigned inside the single line

int[] arr = {1, 2, 3, 4, 5};
```