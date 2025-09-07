import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book getBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return bookList;
    }

    public void updateBookById(Book updatedBook) {
        for (Book book : bookList) {
            if (book.getId().equals(updatedBook.getId())) {
                book.setTitle(updatedBook.getTitle());
                book.setauthor(updatedBook.getAuthor());
            }
        }
    }

    public void removeBookById(String id) {
        var size = bookList.size();
        for (int i = size - 1; i >= 0; i--) {
            if (bookList.get(i).getId().equals(id)) {
                bookList.remove(i);
            }
        }
    }

}
