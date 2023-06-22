package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        int[] array = new int[6];
        System.out.printf("Введите индекс элемента, который хотите получить: ");

        showValueOnIndex(array);
    }

    public static void showValueOnIndex(int[] array) {

        try (Scanner sc = new Scanner(System.in)) {
            int index = sc.nextInt();
            System.out.println(array[index]);
        } catch(InputMismatchException e) {
            System.out.println("Вводить нужно только цифры");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Элемента с таким индексом нет в массиве");
        }
    }
}
