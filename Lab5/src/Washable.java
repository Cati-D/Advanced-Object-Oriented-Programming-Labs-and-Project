public interface Washable {

    public static final int IMPERVIOUS = 0;
    static int RESISTANT = 1;
    int FRAGILE = 2;
    int EXPLOSIVE = 3;

    void wash();

    default boolean needsWash() {
        System.out.println("Wash everything");
        return true;
    }
}
