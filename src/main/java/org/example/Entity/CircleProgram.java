package org.example.Entity;

public class CircleProgram {
    public static void main(String args[]) {
        int radius = 3;
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Длины окружности равна: " + circumference);
    }
}
