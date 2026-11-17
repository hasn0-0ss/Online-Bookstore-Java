
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Store store = new Store();

        Book book1 = new Book(1, "Java Programming", "James Gosling", 1500, 10);
        Book book2 = new Book(2, "Python Basics", "John Smith", 1200, 5);

        store.addBook(book1);
        store.addBook(book2);

        int choice;

        do {

            System.out.println("\n===== ONLINE BOOKSTORE =====");
            System.out.println("1. Show All Books");
            System.out.println("2. Search Book");
            System.out.println("3. Buy Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Update Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                store.showBooks();
            }
            else if (choice == 2) {
                System.out.print("Enter book name: ");
                String name = input.nextLine();
                store.searchBook(name);
            }
            else if (choice == 3) {
                System.out.print("Enter book name: ");
                String name = input.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();

                store.buyBook(name, quantity);
            }
            else if (choice == 4) {
                System.out.print("Enter book name to delete: ");
                String name = input.nextLine();

                store.deleteBook(name);
            }
            else if (choice == 5) {

                System.out.print("Enter book name to update: ");
                String name = input.nextLine();

                System.out.print("Enter new author name: ");
                String author = input.nextLine();

                System.out.print("Enter new price: ");
                double price = input.nextDouble();

                System.out.print("Enter new quantity: ");
                int quantity = input.nextInt();

                store.updateBook(name, author, price, quantity);
            }
            else if (choice == 6) {
                System.out.println("Thank you for visiting!");
            }
            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        input.close();
    }
}
