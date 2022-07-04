package oopLab16.Lab16_3;

public class Book {

    private String author;
    private String name;
    private String theme;
    private double price;
    private int year;

    public Book(String author, String name, String theme, double price, int year) {
        this.author = author;
        this.name = name;
        this.theme = theme;
        this.price = price;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
