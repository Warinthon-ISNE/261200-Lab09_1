package oop.ocp;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) { //constructor - use setter (trying this method of constructor)
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double calculateArea() { // Find area of rectangle
        return this.width * this.height;
    }
}
