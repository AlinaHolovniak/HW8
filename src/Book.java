public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int numberOfPages;
    private double price;

    public Book(int id, String name, String author, String publisher, int year, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageCount=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}
