import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> BooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public double averageNrOfPages(List<Book> someBooks) {
        if (someBooks.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Book book : someBooks) {
            sum += book.getPages();
        }
        return sum/someBooks.size();
    }

    public List<Book> maxPrice(List<Book> list, double price) {
        List<Book> result = new ArrayList<>();
        for (Book book : list) {
            if (book.getPrice() <= price) {
                result.add(book);
            }
        }
        return result;
    }

    public Book mostExpensiveBook(List<Book> list) {
        Book result = null;
        for (Book book : list) {
            if(result == null || book.getPrice() > result.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public List<Book> minPages(List<Book> list, int minPages) {
        List<Book> result = new ArrayList<>();
        for (Book book : list) {
            if (book.getPages() >= minPages) {
                result.add(book);
            }
        }
        return result;
    }
}
