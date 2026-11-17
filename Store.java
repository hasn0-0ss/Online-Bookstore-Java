
import java.util.ArrayList;

public class Store {

    ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display All Books
    public void showBooks() {
        System.out.println("\n===== AVAILABLE BOOKS =====");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search Book
    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("\nBook Found!");
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Buy Book
    public void buyBook(String title, int quantity) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (quantity <= 0) {
                    System.out.println("Invalid quantity!");
                }
                else if (book.getQuantity() >= quantity) {

                    book.setQuantity(book.getQuantity() - quantity);

                    double total = book.getPrice() * quantity;

                    System.out.println("\n===== PURCHASE SUCCESSFUL =====");
                    System.out.println("Book Name: " + book.getTitle());
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Total Price: Rs. " + total);
                }
                else {
                    System.out.println("Not enough stock available!");
                }

                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Delete Book
    public void deleteBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                books.remove(book);

                System.out.println("Book deleted successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Update Book
    public void updateBook(String title, String newAuthor, double newPrice, int newQuantity) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (newPrice <= 0 || newQuantity < 0) {
                    System.out.println("Invalid price or quantity!");
                    return;
                }

                book.setAuthor(newAuthor);
                book.setPrice(newPrice);
                book.setQuantity(newQuantity);

                System.out.println("\nBook updated successfully!");
                book.displayBook();

                return;
            }
        }

        System.out.println("Book not found!");
    }
}
