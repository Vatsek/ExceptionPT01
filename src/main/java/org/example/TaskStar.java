/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
  не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
   которое пользователь может увидеть - RuntimeException, т.е. ваше.*/
package org.example;
import java.util.ArrayList;

public class TaskStar {
    public static void main(String[] args) {
        int[] arr1 = new int[] {9, 10, 2, 8, 6};
        int[] arr2 = new int[] {3, 5, 1, 4, 3};
        System.out.println(devideArray(arr1,arr2));

    }
    public static ArrayList<Integer> devideArray (int[] arr1, int[] arr2) {
        if (arr1.length < 1 || arr2.length < 1) {
            throw new RuntimeException("Один из массивов пуст");
        } else if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов разная");
        } else {
            ArrayList<Integer> result = new ArrayList();
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] != 0){
                    result.add(arr1[i] / arr2[i]);
                }
                else {
                    throw new RuntimeException("Делить на ноль нельзя!");
                }
            }
        return result;
        }
    }
}
