package application;

public class Cone extends Shape {
    private double radius;
    private double height;

    // Parameterized constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to compute surface area
    @Override
    public double surface_area() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    // Method to compute volume
    @Override
    public double volume() {
        return (1 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to print surface area and volume
    @Override
    public String toString() {
        return "Cone - Surface Area: " + surface_area() + ", Volume: " + volume();
    }
}
