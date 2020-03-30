public class ex3 {

    public static void clear(Washable washable) {
        washable.wash();
    }

    public static void main(String[] args) {
        Cup cup = new Cup();
        clear(cup);

        Car car = new Car();
        clear(car);

        Washable WashableWindow = new Washable() {
            @Override
            public void wash() {
                System.out.println("wash anonymous object");
            }
        };
        WashableWindow.wash();

        Washable w1 = new Car() {
            @Override
            public void wash() {
                System.out.println("new car wash.");
            }
        };
        w1.wash();
    }
}
