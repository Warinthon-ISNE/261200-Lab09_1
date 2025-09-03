package oop.ocp;

// its take Shape object in and return that shape calculate method without modify anything


public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
