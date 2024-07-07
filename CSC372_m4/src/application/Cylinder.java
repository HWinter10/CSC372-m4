package application;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to compute surface area
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to compute volume
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to print surface area and volume
    @Override
    public String toString() {
        return "Cylinder - Surface Area: " + surface_area() + ", Volume: " + volume();
    }
}
