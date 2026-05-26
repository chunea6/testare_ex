public class Book implements Borrowable {
    private String title;
    private boolean isAvailable;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public String getBookInfo() {
        String disponibil = isAvailable ? "disponibila" : "imprumutata";
        return title + " - " + author.getAuthorInfo() + " [" + disponibil + "]";
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Cartea \"" + title + "\" a fost imprumutata.");
        } else {
            System.out.println("Cartea \"" + title + "\" nu este disponibila.");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println("Cartea \"" + title + "\" a fost returnata.");
    }
}
