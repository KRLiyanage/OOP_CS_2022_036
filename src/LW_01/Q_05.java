package LW_01;

import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter outer radius (ro): ");
        double ro = sc.nextDouble();

        System.out.print("Enter inner radius (ri): ");
        double ri = sc.nextDouble();

        if (ri >= ro) {
            System.out.println("Error: Inner radius must be smaller than outer radius.");
            return;
        }

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("Area of the circular region (shaded area) = " + shadedArea);

        System.out.println("Circumference of outer circle = " + outerCircle.computeCircumference());
        System.out.println("Circumference of inner circle = " + innerCircle.computeCircumference());

        sc.close();
    }
}
