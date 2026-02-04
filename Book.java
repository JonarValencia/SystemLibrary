public class Book {

    private String title;
    private int pages;
    private Author author;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public String identity() {
        return "I am the Book class. I store book information and reference an author.\n";
    }
}
