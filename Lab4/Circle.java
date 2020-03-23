package Forms;

import java.util.Objects;

public class Circle extends Form {

    private float radius;

    public Circle() {
        radius = 0;
    }

    @Override
    public Form copyForm(Form form) {
        return new Circle((Circle) form);
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super((Form) circle);
        this.radius = circle.radius;
    }

    public  void printCircleDimensions() {
        System.out.println("{Radius: " + radius + "}");
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void printDim() {
        printCircleDimensions();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Float.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", arie: " + getArea() +
                '}';
    }
}


