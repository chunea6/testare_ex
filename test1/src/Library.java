import java.util.HashSet;
import java.util.Set;

public class Library {
    private String libraryName;
    private Set<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Cartile din biblioteca \"" + libraryName + "\":");
        for (Book b : books) {
            System.out.println("  - " + b.getBookInfo());
        }
    }
}
