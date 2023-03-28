package lesson1.task;

import java.util.Scanner;

public class Task2 {
    public static void triangularNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer numberTriangular = scanner.nextInt();
        int result = (numberTriangular*(numberTriangular + 1)/2);
        System.out.println("n-треугольное число " + numberTriangular + " = " + result);
    }
}
