package lesson1.task;

import java.util.Scanner;

public class Task4 {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Double numberOne = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        Double numberSecond = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите операцию(+,-,*,/): ");
        char operation = scanner.next().charAt(0);
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Неверный оператор! Используйте +, - , * , /");
        }
        if (operation == '/' && numberSecond == 0.0) {
            System.err.println("На ноль делить нельзя ");
        }
        if (operation == '+') System.out.println(numberOne + " + " + numberSecond + " = " + (numberOne + numberSecond));
        else if (operation == '-') {
            System.out.println(numberOne + " - " + numberSecond + " = " + (numberOne - numberSecond));
        } else if (operation == '*') {
            System.out.println(numberOne + " x " + numberSecond + " = " + (numberOne * numberSecond));
        } else if (operation == '/') {
            System.out.println(numberOne + " / " + numberSecond + " = " + (numberOne / numberSecond));
        }
    }
}

