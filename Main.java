import java.util.List;
void main() {
    Library library = new Library();
    library.addBook(new Book("Clean Code", "Robert Martin", 45, 464));
    library.addBook(new Book("1984", "George Orwell", 18, 328));
    library.addBook(new Book("Animal Farm", "George Orwell", 12, 112));
    library.addBook(new Book("Java Basics", "Max Müller", 35, 520));
    library.addBook(new Book("The Hobbit", "J. R. R. Tolkien", 28, 310));

    List<Book> all = library.getBooks();

    //Aufgabe 1
    List<Book> orwell = library.BooksByAuthor("George Orwell");
    if (orwell.isEmpty()) {
        System.out.println("no one");
    } else {
        for (Book book : orwell) {
            System.out.println(book.getTitle());
        }
    }
}