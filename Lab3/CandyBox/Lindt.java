package CandyBox;

import java.util.Objects;

public class Lindt extends candyBox {

    private float high;
    private float width;
    private float length;

    public Lindt() {
        this.high = 0;
        this.width = 0;
        this.length = 0;
    }

    public Lindt(String flavor, String origin, float high, float width, float length) {

        super(flavor, origin);
        this.high = high;
        this.width = width;
        this.length = length;
    }

    public Lindt (Lindt c) {
        super(c);
        this.high = c.high;
        this.width = c.width;
        this.length = c.length;
    }

    @Override
    public float getVolume() {
        return high * length * width;
    }

    @Override
    public String toString() {
        return "Lindt{" +
                "high=" + high +
                ", width=" + width +
                ", length=" + length +
                " has volume " + this.getVolume() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lindt)) return false;
        if (!super.equals(o)) return false;
        Lindt lindt = (Lindt) o;
        return Float.compare(lindt.high, high) == 0 &&
                Float.compare(lindt.width, width) == 0 &&
                Float.compare(lindt.length, length) == 0;
    }

    @Override
    public void dime() {
        System.out.println("Lindt{length: " + this.length +
                                ", width: " + this.width +
                                ", high: " + this.high + "}");
    }


}
