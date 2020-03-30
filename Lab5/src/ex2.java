public class ex2 {

    public static void washIfPossible(Washable washable){
        if (washable.needsWash()) {
            washable.wash();
        }
    }

    public static void main(String[] args) {

    }
}
