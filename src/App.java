import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("ENTER-");
            System.out.println("1 To get all Books");
            System.out.println("2 To get Book by its ID");
            System.out.println("3 To create a new book");
            System.out.println("4 To remove a Book by its ID");
            System.out.println("5 To Exit");
            int descision = sc.nextInt();
            switch (descision) {
                case 1:
                    System.out.println(bookstore.getBooks());
                    break;
                case 2:
                    System.out.println("Enter Id of book");
                    String id = sc.next();
                    System.out.println(bookstore.getBookById(id));
                    break;
                case 3:
                    System.out.println("Enter its ID");
                    String newId = sc.next();
                    System.out.println("Enter its Title");
                    String newTitle = sc.next();
                    System.out.println("Enter its Author");
                    String newAuthor = sc.next();
                    Book book = new Book(newId, newTitle, newAuthor);
                    bookstore.addBook(book);
                    break;
                case 4:
                    System.out.println("Enter ID of book to delete");
                    String removeId = sc.next();
                    bookstore.removeBookById(removeId);
                    break;
                case 5:
                    System.exit(200);    
                default:
                    break;
            }
        }
    }

    public static void main2(String[] args) {

        Book book1 = new Book("DJ29JAI33", "Harry Potter & Sorcerers Stone", "JK Rowling");
        Book book2 = new Book("FASUJ47SK", "Dune", "Frank Herbert");
        Bookstore bookstore = new Bookstore();
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
