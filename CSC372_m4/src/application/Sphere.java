package application;

public class Sphere extends Shape {
    private double radius;

    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to compute surface area
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to compute volume
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
    // Method to print surface area and volume
    @Override
    public String toString() {
        return "Sphere - Surface Area: " + surface_area() + ", Volume: " + volume();
    }
}