/*2.Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values. */
class Circle {
    double radius;
    Circle() {
        this(1.0);
    }
    Circle(double radius) {
        this.radius=radius;
    }

    double getArea() {
        return 3.14*radius*radius;
    }

    double getCircumference() {
        return 2*3.14* radius;
    }

    void displayDetails() {
        System.out.println("Radius: " +radius);
        System.out.println("Area: " +getArea());
        System.out.println("Circumference: " +getCircumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.displayDetails();
        Circle c2 = new Circle(5.0);
        c2.displayDetails();
    }
}
