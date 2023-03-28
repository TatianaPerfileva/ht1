package lesson1.task;

import java.util.Scanner;

public class Task3 {
    public static void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer numberFactorial = scanner.nextInt();
        System.out.println("факториал числа " + numberFactorial);
        int result = 1;
        while (numberFactorial != 1) {
            result = result * numberFactorial;
            numberFactorial--;
        }
        System.out.println(result);
    }
}
