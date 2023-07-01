package ro.sit.homework;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Ion Creanga", "ion@creanga.com");
        Book book = new Book("Amintiri din copilarie", 1988, author, 25.55);

        System.out.println(
                "Book " + book.getName()
                        + "(" + book.getPrice()
                        + " RON), by "
                        + book.getAuthor().getName()
                        + ", published in "
                        + book.getYear()
        );
    }
}
