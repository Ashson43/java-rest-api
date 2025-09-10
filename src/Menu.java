import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    String mainMenu() {
        
        System.out.println("ENTER-");
        System.out.println("1 To get all Books");
        System.out.println("2 To get Book by its ID");
        System.out.println("3 To create a new book");
        System.out.println("4 To remove a Book by its ID");
        System.out.println("5 To Update a Book by its ID");
        System.out.println("6 To Exit");
        return sc.next();
    }

    void getAllBooks(Bookstore bookstore) {
        
        System.out.println(bookstore.getBooks());
    }

    void getBookById(Bookstore bookstore) {
        
        System.out.println("Enter Id of book");
        String id = sc.next();
        System.out.println(bookstore.getBookById(id));
    }

    void createBookById(Bookstore bookstore) {
        
        System.out.println("Enter its ID");
        String newId = sc.next();
        System.out.println("Enter its Title");
        String newTitle = sc.next();
        System.out.println("Enter its Author");
        String newAuthor = sc.next();
        Book book = new Book(newId, newTitle, newAuthor);
        bookstore.addBook(book);
    }

    void removeBookById(Bookstore bookstore) {
        
        System.out.println("Enter ID of book to delete");
        String removeId = sc.next();
        bookstore.removeBookById(removeId);
    }

    void updateBookById(Bookstore bookstore) {
        
        System.out.println("Enter ID of the book to update");
        String updatedId = sc.next();
        String oldTitle = bookstore.getBookById(updatedId).getTitle();
        String oldAuthor = bookstore.getBookById(updatedId).getAuthor();
        Book oldBook = new Book(updatedId, oldTitle, oldAuthor);
        System.out.println("Enter updated author name. Old one is " + bookstore.getBookById(updatedId).getAuthor());
        String updatedAuthor = sc.next();
        System.out.println("Enter updated Title. Old one is " + bookstore.getBookById(updatedId).getTitle());
        String updatedTitle = sc.next();
        Book updatedBook = new Book(updatedId, updatedTitle, updatedAuthor);
        bookstore.updateBookById(updatedBook);
        System.out.println("Book " + oldBook + "\n was updated to " + updatedBook);
    }

}
