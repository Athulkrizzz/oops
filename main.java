// Shape.java
class Shape {
    public void display() {
        System.out.println("This is shape");
    }
}

// Rectangle.java
class Rectangle extends Shape {
    @Override
    public void display() {
        System.out.println("This is rectangular shape");
    }
}

// Circle.java
class Circle extends Shape {
    @Override
    public void display() {
        System.out.println("This is circular shape");
    }
}

// Square.java
class Square extends Rectangle {
    public void display() {
        System.out.println("Square is a rectangle");
    }
    
    public void callShapeMethod() {
        super.display(); // Calls the display() method of Rectangle (which is inherited from Shape)
    }
}

// Main.java
public class main {
    public static void main(String[] args) {
        Square square = new Square();

        // Calling method of Square class
        square.display();

        // Calling method of Rectangle class (inherited from Shape)
        square.callShapeMethod();
    }
}

