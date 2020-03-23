package Bookstore;

public class BookstoreCheck {

    public static int duplicate (Book[] book, Book duplicat) {
        int s = 0;
        for (Book b: book) {
            if (duplicat.equals(b)) {
                s += 1;
            }
        }
        return s;
    }

    public static Book cmp (Book book1, Book book2) {
        if (book1.getPageCount() > book2.getPageCount())
            return book1;
        return book2;
    }
}
