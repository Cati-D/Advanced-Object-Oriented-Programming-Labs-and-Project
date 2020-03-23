package Forms;

import java.util.Objects;

public class Triangle extends Form {

    private int height;
    private float base;

    public Triangle() {
        height = 0;
        base = 0;
    }

    public Triangle(String color, int height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public Triangle(Triangle triangle) {
        super((Form) triangle);
        this.height = height;
        this.base = base;
    }

    public  void printTriangleDimensions() {
        System.out.println("{Triangle: " + height + base + "}");
    }

    @Override
    public Form copyForm(Form form) {
        return null;
    }

    @Override
    public float getArea() {
        return height * base / 2;
    }

    @Override
    public void printDim() {
        printTriangleDimensions();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height &&
                Float.compare(triangle.base, base) == 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                " ,area: " + getArea() +
                '}';
    }
}
