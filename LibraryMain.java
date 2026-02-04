public class LibraryMain {

    public static void main(String[] args) {

        Author author = new Author("George Orwell");
        Book book = new Book("1984", 328, author);
        Borrower borrower = new Borrower("Alex");

        borrower.borrow(book);

        String output =
                identity()
              + author.identity()
              + book.identity()
              + borrower.identity();

        System.out.println(output); // ✅ ONLY println in the entire program
    }

    public static String identity() {
        return "I am the LibraryMain class. I control the execution of the library system.\n";
    }
}
