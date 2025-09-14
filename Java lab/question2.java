import java.util.Scanner;

class Book {
    String title;
    String author;
    String category;
    double price;
    String ISBN;
}

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        // Input details for 5 books
        for (int i = 0; i < 5; i++) {
            books[i] = new Book();
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Title: ");
            books[i].title = sc.nextLine();

            System.out.print("Author: ");
            books[i].author = sc.nextLine();

            System.out.print("Category: ");
            books[i].category = sc.nextLine();

            System.out.print("Price: ");
            books[i].price = sc.nextDouble();
            sc.nextLine(); // consume newline

            System.out.print("ISBN: ");
            books[i].ISBN = sc.nextLine();
        }

        // Display all book details
        System.out.println("\nBook Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println("Title: " + books[i].title);
            System.out.println("Author: " + books[i].author);
            System.out.println("Category: " + books[i].category);
            System.out.println("Price: " + books[i].price);
            System.out.println("ISBN: " + books[i].ISBN);
        }

        sc.close();
    }
}

