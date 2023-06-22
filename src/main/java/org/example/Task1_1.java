package org.example;

public class Task1_1 {
    public static void main(String[] args)
    {
        devide(2,0);
    }

    public static int devide(int a1, int a2) {
        if (a2 ==0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return a1/a2;
    }
}