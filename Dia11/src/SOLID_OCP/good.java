
package SOLID_OCP;


abstract class Shape {

    abstract double calculateArea();
}
public class good {

    static class Rectangle extends Shape {

        double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double calculateArea() {
            return width * height;
        }
    }

    static class Circle extends Shape {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class AreaCalculator {

        public static double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }
    public static void main(String[] args) {
        Shape rectangulo = new Rectangle(10, 5);
        Shape circulo = new Circle(7);

        System.out.println("Area del rectángulo: " + AreaCalculator.calculateArea(rectangulo));
        System.out.println("Area del circulo: " + AreaCalculator.calculateArea(circulo));
    }
}
