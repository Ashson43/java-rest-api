

public class App {
     public static void main(String[] args) {

        Book book1 = new Book("DJ29JAI33", "Harry Potter & Sorcerers Stone", "JK Rowling");
        Book book2 = new Book("FASUJ47SK", "Dune", "Frank Herbert");
        Bookstore bookstore= new Bookstore();
        bookstore.addBook(book1);
        bookstore.addBook(book2);
        System.out.println(bookstore.getBookById("DJ29JAI33"));
        book2.setauthor("Rick Riordan");
        book2.setTitle("The Lightning Thief");
        bookstore.updateBookById(book2);
        System.out.println(bookstore.getBooks());
        bookstore.removeBookById("DJ29JAI33");
        System.out.println(bookstore.getBooks());


    }
}
