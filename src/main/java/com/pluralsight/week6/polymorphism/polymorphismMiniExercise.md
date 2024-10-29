1. Create three classes: Shape, Square and Circle
2. Give them a logical inheritance "order"
3. To shape, add the method calculateArea and calculateCircumference, they just print a line
4. To shape, add a property color
5. To Square, add a property side size and getter/setter
6. To Circle, add a property radius and getter/setter
7. Override the methods for calculating in both square and circle
8. Create a program, and add this:

```java
Shape s1 = new Shape();
Shape s2 = new Square();
Shape s3 = new Circle();

// set the fields and call the methods for calculating on each
// can you print the radius of the circle? access in here, not in circle
// can you print the side size of the square?
```