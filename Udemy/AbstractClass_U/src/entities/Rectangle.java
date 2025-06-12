package entities;

import entities_enum.Color;

public class Rectangle extends Shape {

    private double widht, height;

    public Rectangle() {
    }

    public Rectangle(double widht, double height, Color color) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeitgt(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return widht * height;
    }

}
