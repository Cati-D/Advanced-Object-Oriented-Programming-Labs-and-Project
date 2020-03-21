package CandyBox;

public class Heidi extends candyBox {

    private float length;

    public Heidi() {
        this.length = 0;}

    public Heidi(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString() {
        return "Heidi{" +
                "length=" + length +
                " has volume " + this.getVolume() +
                '}';
    }

    public Heidi (Heidi c) {
        super(c);
        this.length = c.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Heidi)) return false;
        if (!super.equals(o)) return false;
        Heidi heidi = (Heidi) o;
        return Float.compare(heidi.length, length) == 0;
    }

    @Override
    public void dime() {
        System.out.println("Heidi { length: " + this.length + "}");
    }
}

