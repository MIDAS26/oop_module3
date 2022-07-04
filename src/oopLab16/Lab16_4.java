package oopLab16;

import java.util.ArrayList;
import java.util.List;

public class Lab16_4 {
    public static <T> void main(String[] args) {
        List<T> domains = new ArrayList<>();

        domains.add((T) "qw.edu");
        domains.add((T) "qwsaf.edu");
        domains.add((T) "qwsasg.ua");
        domains.add((T) "qw.com");
        domains.add((T) "qwsaf.net");
        domains.add((T) "sagasg.org");
        domains.add((T) "gsagsag.ua");
        domains.add((T) "mbksdndsg.gr");
        domains.add((T) "sagsagsag.edu");
        domains.add((T) "lgmdkwlk.ua");

        List<String> searchedData = new ArrayList<>();
        for (T domain : domains) {
            if (domain.toString().contains(".edu") || domain.toString().contains(".ua")) {
                searchedData.add(domain.toString());
            }
        }
        searchedData.forEach(System.out::println);
    }
}
