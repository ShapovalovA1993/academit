package src.lesson_4;

import java.util.Scanner;

public class NumberDigits {

    public static int getDigitsSum(int number) {
        String numberToString = Integer.toString(Math.abs(number));

        char[] charArray = numberToString.toCharArray();
        int digitsSum = 0;

        for (int i = 0; i < numberToString.length(); ++i) {
            int digit = Character.getNumericValue(charArray[i]);
            digitsSum = digitsSum + digit;
        }

        return digitsSum;
    }

    public static int getOddDigitsSum(int number) {
        String numberToString = Integer.toString(Math.abs(number));

        char[] charArray = numberToString.toCharArray();
        int oddDigitsSum = 0;

        for (int i = 0; i < numberToString.length(); ++i) {
            int digit = Character.getNumericValue(charArray[i]);

            if (digit % 2 != 0) {
                oddDigitsSum = oddDigitsSum + digit;
            }
        }

        return oddDigitsSum;
    }

    public static int getMaxDigit(int number) {
        String numberToString = Integer.toString(Math.abs(number));

        char[] charArray = numberToString.toCharArray();
        int maxDigit = 0;

        for (int i = 0; i < numberToString.length(); ++i) {
            int digit = Character.getNumericValue(charArray[i]);

            if (digit > maxDigit) {
                maxDigit = digit;
            }
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
