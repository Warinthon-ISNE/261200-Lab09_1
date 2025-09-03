package oop.ocp;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) { //constructor - use setter
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() { // Find area of circle
        return Math.PI * this.radius * this.radius;
    }
}
