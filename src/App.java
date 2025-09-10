import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        Scanner sc = new Scanner(System.in);
        Menu menu=new Menu();
        for (;;) {
            String decision = menu.mainMenu();
            switch (decision) {
                case "1":
                    menu.getAllBooks(bookstore);
                    break;
                case "2":
                    menu.getBookById(bookstore);
                    break;
                case "3":
                    menu.createBookById(bookstore);
                    break;
                case "4":
                    menu.removeBookById(bookstore);
                    break;
                case "5":
                    menu.updateBookById(bookstore);
                    break;
                case "6":
                    sc.close();
                    System.exit(200);
                default:
                    break;
            }
        }
    }

    }
