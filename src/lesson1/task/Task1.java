package lesson1.task;

public class Task1 {
    public static void derivePrimeNumbers() {
        for (int i = 3; i < 1000; i += 2) {
            boolean isPrime = true;
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
            }
        }
    }
