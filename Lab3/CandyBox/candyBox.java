package CandyBox;

public abstract class candyBox {

    private String flavor;
    private String origin;

    public candyBox() {
        this.flavor = "";
        this.origin = "";
    }

    public candyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    public String getFlavor(){return this.flavor;}

    public String getOrigin() {return this.origin;}

    public candyBox(candyBox b) {
        this(b.flavor, b.origin);
    }

    public abstract void dime();

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof candyBox) {
            candyBox cb = (candyBox) obj ;
            return (flavor.equals(cb.flavor) && origin.equals(cb.origin));
        }
        return false;
    }
}
