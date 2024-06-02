import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookOperations {
    private List<Book> books = new ArrayList<>();

    public BookManager() {
        books.add(new Book("Pride and Prejudice", "Jane Austen", "ISBN001", 1813));
        books.add(new Book("War and Peace", "Leo Tolstoy", "ISBN002", 1805));
        books.add(new Book("Dead Souls", "Gogol Nikolai", "ISBN003", 1842));
        books.add(new Book("Eugene Onegin", "Alexandr Pushkin", "ISBN004", 1823));
        books.add(new Book("Scarlet Sails", "Aleksandr Grin", "ISBN005", 1916));
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void updateBook(Book oldBook, Book newBook) {
        int index = books.indexOf(oldBook);
        if (index != -1) {
            books.set(index, newBook);
        }
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }
}