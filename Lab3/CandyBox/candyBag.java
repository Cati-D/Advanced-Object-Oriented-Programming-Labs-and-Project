package CandyBox;

public class candyBag {

    private int size;
    private int quantity;
    private candyBox[] bag;

    public candyBag(int size) {
        this.quantity = 0;
        if (size > 0) {
            this.size = size;
            bag = new candyBox[size];
        }
    }

    public void addCandy (candyBox b) {
        for (int i = 0; i < quantity; i++) {
            if (bag[i].equals(b)) {
                System.out.println("Already in the bag: " + b);
                return;
            }
        }

        if (quantity + 1 > size) {
            System.out.println("The bag is full, couldn't add: " + b);
            return;
        }

        if (b instanceof Lindt) {
            System.out.println("Added: " + b);
            bag[quantity++] = new Lindt((Lindt) b);
        }

        if (b instanceof Milka) {
            System.out.println("Added: " + b);
            bag[quantity++] = new Milka((Milka) b);
        }
        if (b instanceof Heidi) {
            System.out.println("Added: " + b);
            bag[quantity] = new Heidi((Heidi) b);
        }
    }

    public void printInside() {
        if (quantity == 0) {
            System.out.println("\nEmpty bag");
            return;
        }

        System.out.println("\nInside the bag: ");

        for (int i = 0; i < quantity; i++) {
            System.out.println(bag[i]);
        }
    }
}
