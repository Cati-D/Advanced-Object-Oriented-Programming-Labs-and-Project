package Bookstore;

import java.util.Objects;
import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        if (pageCount < 1) {
            this.pageCount = 1;
        } else {
            this.pageCount = pageCount;
        }
    }

    public Book() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNew book: ");
        System.out.println("\tTitle:    ");
        title = scanner.nextLine();
        System.out.println("\tAuthor:   ");
        author = scanner.nextLine();
        System.out.println("\tPublisher:    ");
        publisher = scanner.nextLine();
        while (true){
            System.out.println("\tPageCount:    ");
            pageCount = scanner.nextInt();
            if (pageCount > 0) {
                break;
            }
            System.out.println("Nu exista numar de pagini negative!");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 0)
            System.out.println("Cartea nu poate avea numar negativ de pagini.");
        else
            this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPageCount() == book.getPageCount() &&
                getTitle().equals(book.getTitle()) &&
                getAuthor().equals(book.getAuthor()) &&
                getPublisher().equals(book.getPublisher());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title.toUpperCase() + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher.toLowerCase() + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
