import java.util.Arrays;
import java.util.Scanner;

public class Books {
    private Book[] shelf;
    private int booksAmount;
    private int counter;


    public Book[] getShelf() {
        return shelf;
    }

    public int getBooksAmount() {
        return booksAmount;
    }

    public Books(int booksAmount) {
        this.booksAmount = booksAmount;
        shelf = new Book[booksAmount];
    }

    public void addBook(Book book) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                shelf[i] = book;
                break;
            }

        }
    }

    public void showAllBooks() {
        for (Book elem : shelf) {
            if (elem == null) {
                break;
            }
            System.out.println(elem.toString());
        }
    }

    public static int getSizeArray() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("");
        while (true) {
            size = sc.nextInt();
            try {
                Validator.validateShelfSize(size);
                break;
            } catch (InvalidSizeException e) {
                System.out.println(e.getMessage());
                System.out.println("Books.getSizeArray: Number can't be negative");
            }
        }
        return size;
    }

    public double getPercent() {
        Scanner sc = new Scanner(System.in);
        double percentage = 0.00;
        System.out.println("Input percent to change the price ");
        for (int i = 0; i < shelf.length; i++) {
            percentage = sc.nextDouble();
            try {
                Validator.validatePercent(percentage);
                break;
            } catch (InvalidPercentException e) {
                System.out.println(e.getMessage());
                System.out.println("Please, enter percent > -100 ");
            }
        }
        return percentage;

    }
    public void changePrice (double percentage) {
    double newPersentage = percentage * 0.01f;
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                break;
            }
            double oldPrice = shelf[i].getPrice();
            double newPrice = oldPrice + oldPrice * newPersentage;
            shelf[i].setPrice(newPrice);
        }
    }

    public String getSearchAuthor() {
        Scanner sc = new Scanner(System.in);
        String searchAuthor;
        System.out.println("Input Author for searching  --> ");
        while (true) {
            searchAuthor = sc.nextLine();
            try {
                Validator.validateAuthor(searchAuthor);
                break;
            } catch (InvalidAuthorException e) {
                System.out.println(e.getMessage());
                System.out.println("Please, enter Author for searching --> ");
            }
        }
        return searchAuthor;
    }

    public Books findByAuthor( String searchAuthor) {
        Books authorMass = new Books(booksAmount);
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                break;
            }
            String authorName = shelf[i].getAuthor();
            if (authorName.equals(searchAuthor)) {
                authorMass.shelf[counter] = shelf[i];
                counter++;
            } if (counter == 0) {
                System.out.println("Books of this author are not found");
                break;
            }
        }
        return authorMass;
    }

    public Books findByYear ( int year) {
        Books yearMass = new Books(booksAmount);
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                break;
            }
            int yearOfIssue = shelf[i].getYear();
            if (yearOfIssue > year) {
                yearMass.shelf[counter] = shelf[i];
                counter++;
            }
            if (counter == 0) {
                System.out.println("Books published after this year are not found");
                break;
            }
        }
        return yearMass;
    }

    public void sortByAuthor() {
        Book [] res = Arrays.copyOf(shelf, counter);
        Arrays.sort(res, new MyComparatorAuthor());
        System.out.println("Books after sorting by Author: ");
        printBooksRes(res);
    }

    public void sortByPublisher() {
        Book[] res = Arrays.copyOf(shelf, counter);
        Arrays.sort(res, new MyComparatorPublisher());
        System.out.println("Books after sorting by Publisher: ");
        printBooksRes(res);
    }

    public void sortByPrice() {
        Book[] res = Arrays.copyOf(shelf, counter);
        Arrays.sort(res, new MyComparatorPrice());
        System.out.println("Books after sorting by Price: ");
        printBooksRes(res);
    }

    public void printBooksRes(Book[] array) {
        if (counter == 0) {
            System.out.println("No elements");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println(array[i]);
            }
        }
    }

}

