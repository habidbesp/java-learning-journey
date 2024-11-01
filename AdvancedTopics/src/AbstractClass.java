/*Abstract classes are base classes that cannot be

instantiated and may contain abstract methods (without implementation)

for subclasses to define.*/

public class AbstractClass {
    public static void main(String[] args) {
        GeometricFigure rectangle = new Rectangle();
        rectangle.draw();

        GeometricFigure circle = new Circle();
        circle.draw();
    }
}


// Abstract Class

abstract class GeometricFigure { // not able to instantiate
    public abstract void draw();
}

class Rectangle extends GeometricFigure{
    @Override // implementation
    public void draw(){
        System.out.println("A Rectangle must be drawn");
    }
}

class Circle extends GeometricFigure {
    @Override
    public void draw() {
        System.out.println("A Circle must be drawn");
    }
}