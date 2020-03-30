public class Cup  implements BubbleBathable{

    double volum;
    String culoare;

    public int getLevelOfFragility() {
        return Washable.FRAGILE;
    }

    @Override
    public boolean needsWash () {return false;}

    @Override
    public void wash() {
        System.out.println("Washing a cup.");
    }

    @Override
    public void soak() {}

    @Override
    public void takeBubbleBath() {}

    @Override
    public void scrub() {}
}
