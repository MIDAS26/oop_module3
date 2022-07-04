package oopLab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Lab16_2 {
    public static void main(String[] args) throws IOException {
        String[] dataArr;
        Path fileName = Path.of("D:\\AlgLab2\\src\\oopLab16\\Lab16_2.txt");
        String str = Files.readString(fileName);

        System.out.println(str);
        dataArr = str.split(" |\\r?\\n");
        List<String> searchedData = new ArrayList<>();
        for (int s = 0; s < dataArr.length; s++) {
            if (Objects.equals(dataArr[s], "таємно")) {
                searchedData.add(dataArr[s]);
            } else if (Objects.equals(dataArr[s], "для") && Objects.equals(dataArr[s+1], "службового") && Objects.equals(dataArr[s+2], "використання")) {
                searchedData.add(dataArr[s]+" "+dataArr[s+1]+" "+dataArr[s+2]);
            }
        }
        searchedData.forEach(System.out::println);
    }
}
