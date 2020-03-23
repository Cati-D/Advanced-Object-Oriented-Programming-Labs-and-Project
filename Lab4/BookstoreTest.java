package Bookstore;

public class BookstoreTest {

    public static void main(String[] args) {
        Book book1 = new Book ("Titlu1", "Autor1", "Editura1", 1);
        Book book2 = new Book ("Title2", "autor2", "aditura2", 2);

        System.out.println("Book1.autor" + book1.getAuthor());
        System.out.println("Book2.titlu" + book2.getTitle());

        book1.setTitle("Titlu");
        System.out.println("book1.titlu = " + book1.getTitle() );
        book2.setPageCount(-3);
        System.out.println("book2.page " + book2.getPublisher());

        book1 = null;
        System.out.println("book1 = " + book1);
        book1 = new Book();
        System.out.println(book1);

        Book[] books = new Book[50];
        String s;
        for (int i = 0; i < 30; i++) {
            s = Integer.toString(i % 11,+ 1);
            books[i] = new Book(s, s, s, i % 11 + 1);
            System.out.println(books[i]);
        }

        System.out.println(BookstoreCheck.duplicate(books, books[0]));
        System.out.println(BookstoreCheck.duplicate(books, books[11]));

        System.out.println(BookstoreCheck.cmp(books[5], books[9]));
        System.out.println(BookstoreCheck.cmp(books[20], books[15]));

    }
}
