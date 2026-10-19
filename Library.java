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
}
