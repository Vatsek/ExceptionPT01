package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1_3 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/pavelvatsek/GB/123.csv"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (IOException e){
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
