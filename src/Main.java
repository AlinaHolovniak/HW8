import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Books shelf1 = new Books(6);
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitgerald", "Publisher1", 1990, 155, 80.50);
        Book book2 = new Book(2, "Ulysses", "J. Joyce", "Publisher2", 1957, 88, 54.00);
        Book book3 = new Book(3, "Lolita", "V. Nabokov", "Publisher3", 1978, 300, 90.45);
        shelf1.addBook(book1);
        shelf1.addBook(book2);
        shelf1.addBook(book3);
        shelf1.showAllBooks();


   /*     shelf1.showAllBooks();
        System.out.println("Enter Author");
        scanner.nextLine();
        shelf1.findByAuthor(scanner.nextLine()).showAllBooks();
        System.out.println("Enter year");
        shelf1.findByYear(scanner.nextInt()).showAllBooks();
        shelf1.toString();
*/
        shelf1.getSearchAuthor();
        shelf1.findByAuthor(scanner.nextLine());
        shelf1.getPercent();
        shelf1.changePrice(scanner.nextDouble());
        shelf1.sortByAuthor();
        shelf1.sortByPublisher();
        shelf1.sortByPrice();
    }
}

