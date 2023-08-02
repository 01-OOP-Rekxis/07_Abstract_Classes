package com.cc.java;

public class App {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(10.0);
        Triangle triangle = new Triangle(10.0, 10.0);

        output("------ Flächen ------");

        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());

        output("------  Differenzen ------");

        output("Diff. r-t: " + areaDiff(rectangle, triangle));
        output("Diff. r-c: " + areaDiff(rectangle, circle));
        output("Diff. c-r: " + areaDiff(circle, rectangle));
        output("Diff. c-t: " + areaDiff(circle, triangle));
        output("Diff. t-t: " + areaDiff(triangle, triangle));

    }

    // 1. Iteration: ggf. 1000x überladen ...

    // private static double areaDiff(Circle c, Rectangle r) {
    //     return c.area() - r.area();
    // }

    // 2. Iteration: Polymorphie

    private static double areaDiff(Shape s1, Shape s2) {
        return s1.area() - s2.area();
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
