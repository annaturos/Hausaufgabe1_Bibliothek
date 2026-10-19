import java.util.List;
void main() {
    Library library = new Library();

    Book cleanCode = new Book("Clean Code", "Robert Martin", 45, 464);
    Book b1984 = new Book("1984", "George Orwell", 18, 328);
    Book animalFarm = new Book("Animal Farm", "George Orwell", 12, 112);
    Book javaBasics = new Book("Java Basics", "Max Müller", 35, 520);
    Book hobbit = new Book("The Hobbit", "J. R. R. Tolkien", 28, 310);

    library.addBook(cleanCode);
    library.addBook(b1984);
    library.addBook(animalFarm);
    library.addBook(javaBasics);
    library.addBook(hobbit);

    //Aufgabe 1
    List<Book> orwell = library.BooksByAuthor("George Orwell");
    if (orwell.isEmpty()) {
        System.out.println("no one");
    } else {
        for (Book book : orwell) {
            System.out.println(book.getTitle());
        }
    }

    //Aufgabe 2
    List<Book> listOfBooks;
    listOfBooks = List.of(cleanCode, b1984, animalFarm);
    System.out.println(library.averageNrOfPages(listOfBooks));

    //Aufgabe3
    List<Book> all = library.getBooks();
    List<Book> max_30 = library.maxPrice(all, 30);
    for (Book book : max_30) {
        System.out.println(book.getTitle() + " -> " + book.getPrice() + " Euro");
    }

    //Aufgabe 4
    List<Book> listOfBooks2;
    listOfBooks2 = List.of(hobbit, b1984, animalFarm);
    if (listOfBooks2.isEmpty()) {
        System.out.println("none");
    } else {
        Book expensive = library.mostExpensiveBook(listOfBooks2);
        System.out.println(expensive.getTitle() + " (" + expensive.getPrice() + " Euro)");
    }

    //Aufgabe 5
    List<Book> minimumPages = library.minPages(all, 300);
    if (minimumPages.isEmpty()) {
        System.out.println("none");
    } else {
        for (Book book : minimumPages) {
            System.out.println(book.getTitle());
        }
    }

    //Aufgabe 6
    List<Book> pair = library.twoInABudget(library.getBooks(), 55);
    if (pair.isEmpty()) {
        System.out.println("Doesn't exist");
    } else {
        System.out.println(pair.get(0).getTitle() + " + " + pair.get(1).getTitle());
        System.out.println("Gesamtpreis: " + (pair.get(0).getPrice() + pair.get(1).getPrice()) + " Euro");
    }
}