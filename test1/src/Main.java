public class Main {
    public static void main(String[] args) {
        Author autor1 = new Author("Ion Creanga", "Romana");
        Author autor2 = new Author("Mihai Eminescu", "Romana");

        Book carte1 = new Book("Amintiri din copilarie", autor1);
        Book carte2 = new Book("Luceafarul", autor2);
        Book carte3 = new Book("Harap-Alb", autor1);

        Library biblioteca = new Library("Biblioteca Centrala");
        biblioteca.addBook(carte1);
        biblioteca.addBook(carte2);
        biblioteca.addBook(carte3);

        biblioteca.showBooks();

        System.out.println();
        carte1.borrowItem();
        carte1.borrowItem();

        System.out.println();
        carte1.returnItem();

        System.out.println();
        biblioteca.showBooks();
    }
}
