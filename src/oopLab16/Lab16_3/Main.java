package oopLab16.Lab16_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Vasia Pupkin", "Programming", "Programming", 100, 1999);
        Book book2 = new Book("NoName", "Programming", "Programming", 50, 2020);
        Book book3 = new Book("Ivan Franko", "Zbirca", "Novel", 120, 1980);
        Book book4 = new Book("Taras Shevchenko ", "Kateryna", "Novel", 200, 1976);
        Book book5 = new Book("Lesia Ukrainka", "Zbirca", "Poem", 199, 1999);
        Book book6 = new Book("Jo Nesbo", "Snowmen", "Detective", 100, 2017);
        Book book7 = new Book("Myhailo Kotsubynskiy", "Eneida", "Novel", 100, 1999);
        Book book8 = new Book("Igor Okhman", "Programming", "Programming", 70, 2007);
        Book book9 = new Book("Elena Boiko", "Engineering", "engineerine", 100, 1999);
        Book book10 = new Book("Lora Batova", "Programming", "Programming", 100, 2019);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        List<Book> result = books
                .stream()
                .filter(b -> b.getTheme().equals("Programming") && b.getPrice() <= 100 && b.getYear() > 2006)
                .collect(Collectors.toList());

        result.forEach(b -> System.out.println(b.toString()));
    }
}
