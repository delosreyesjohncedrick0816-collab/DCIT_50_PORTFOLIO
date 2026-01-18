import java.util.Scanner;

public class Lab1JavaReview {

    static final int MAX_BOOKS = 5;
    static String[] bookTitles = new String[MAX_BOOKS];
    static String[] bookStatus = new String[MAX_BOOKS];
    static int bookCount = 0;

    public static void addBook(Scanner scanner) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Maximum limit reached, cannot add more books!");
            return;
        }
        scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        bookTitles[bookCount] = title;
        bookStatus[bookCount] = "Available";
        bookCount++;

        System.out.println("Book successfully added!");
    }

    public static void showBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n--- Book List ---");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + bookTitles[i] + " - " + bookStatus[i]);
        }
    }

    public static void updateStatus(Scanner scanner) {
        if (bookCount == 0) {
            System.out.println("No books available.");
            return;
        }
        showBooks();
        System.out.print("Enter book number to update: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > bookCount) {
            System.out.println("Invalid choice.");
            return;
        }

        int index = choice - 1;
        if (bookStatus[index].equals("Available")) {
            bookStatus[index] = "Borrowed";
            System.out.println(bookTitles[index] + " is now Borrowed.");
        } else {
            bookStatus[index] = "Available";
            System.out.println(bookTitles[index] + " is now Available.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Update Book Status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1: addBook(scanner); break;
                case 2: showBooks(); break;
                case 3: updateStatus(scanner); break;
                case 4: System.out.println("Exiting program..."); break;
                default: System.out.println("Invalid option!");
            }
        } while (option != 4);
        scanner.close();
    }
}