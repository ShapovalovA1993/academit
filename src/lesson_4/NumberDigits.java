package src.lesson_4;

import java.util.Scanner;

public class NumberDigits {

    public static int getDigitsSum(int number) {
        int numberModule = Math.abs(number);

        int digitsSum = 0;
        while (numberModule > 0) {
            int digit = numberModule % 10;
            digitsSum = digitsSum + digit;
            numberModule = numberModule / 10;
        }

        return digitsSum;
    }

    public static int getOddDigitsSum(int number) {
        int numberModule = Math.abs(number);

        int oddDigitsSum = 0;
        while (numberModule > 0) {
            int digit = numberModule % 10;

            if (digit % 2 != 0) {
                oddDigitsSum = oddDigitsSum + digit;
            }

            numberModule = numberModule / 10;
        }

        return oddDigitsSum;
    }

    public static int getMaxDigit(int number) {
        int numberModule = Math.abs(number);

        int maxDigit = 0;
        while (numberModule > 0) {
            int digit = numberModule % 10;

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            numberModule = numberModule / 10;
        }

        return maxDigit;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();

        System.out.println("Сумма цифр числа: " + getDigitsSum(number));
        System.out.println("Сумма нечетных цифр числа: " + getOddDigitsSum(number));
        System.out.println("Максимальная цифра числа: " + getMaxDigit(number));

    }
}
