package CandyBox;
/*b. - Milka va fi un cilindru;
- constructori fără parametri;
- constructori care permit inițializarea membrilor. Identificați o modalitate de reutilizare
a codului existent. Pentru fiecare tip de cutie veti initializa, in constructor, campurile flavor
și origin cu tipul corespunzator.
*/

import java.util.Objects;

public class Milka extends candyBox {

    private float high;
    private float radius;

    public Milka() {
        this.high = 0;
        this.radius = 0;
    }

    public Milka(String flavor, String origin, float high, float radius) {
        super(flavor, origin);
        this.high = high;
        this.radius = radius;
    }

    public Milka (Milka c) {
        super (c);
        this.radius = c.radius;
        this.high = c.high;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * high);
    }

    @Override
    public void dime() {
        System.out.println("Milka{ radius: " + this.radius +
                                ", high: " + this.high +
                                "}");
    }

    @Override
    public String toString() {
        return "Milka{" +
                "high=" + high +
                ", radius=" + radius +
                " has volume " + getVolume() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Milka)) return false;
        if (!super.equals(o)) return false;
        Milka milka = (Milka) o;
        return Float.compare(milka.high, high) == 0 &&
                Float.compare(milka.radius, radius) == 0;
    }

}
