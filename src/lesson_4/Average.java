package src.lesson_4;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число диапазона: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите последнее число диапазона: ");
        int lastNumber = scanner.nextInt();

        int numbersSum = 0;
        int evenNumbersSum = 0;
        int numbersCount = 0;
        int evenNumbersCount = 0;

        for (int i = firstNumber; i <= lastNumber; ++i) {
            numbersSum = numbersSum + i;
            ++numbersCount;

            if (i % 2 == 0) {
                evenNumbersSum = evenNumbersSum + i;
                ++evenNumbersCount;
            }
        }

        double numbersAverage = (double) numbersSum / numbersCount;
        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.println("Среднее арифметическое чисел: " + numbersAverage);
        System.out.println("Среднее арифметическое четных чисел: " + evenNumbersAverage);

    }
}