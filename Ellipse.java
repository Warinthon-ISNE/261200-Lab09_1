package oop.ocp;

public class Ellipse extends Shape{
    private double majorAxis, minorAxis;

    public Ellipse(double majorAxis, double minorAxis) { //constructor - use setter
        this.setMajorAxis(majorAxis);
        this.setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }
    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }
    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.majorAxis * this.minorAxis;
    }
}
