package oop.ocp;

public class Lab09_1 {
    public static void main(String[] args) {

        Shape rect   = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse= new Ellipse(6, 4);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Rectangle area: " + calculator.calculateArea(rect));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse area: " + calculator.calculateArea(ellipse));
    }
}