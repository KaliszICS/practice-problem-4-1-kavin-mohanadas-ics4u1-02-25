public class Circle {
    private double radius;
    
    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double circumference() {
        return 2 * 3.14 * this.radius;
    }

    public double area() {
        return 3.14 * this.radius * this.radius;
    }
}