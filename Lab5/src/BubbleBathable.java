public interface BubbleBathable extends  Soakable, Scrubable{
    void takeBubbleBath ();

    default void wash() {
       // Soakable.super.wash();
        System.out.println("Default wash is bubble bathing.");
    }
}
