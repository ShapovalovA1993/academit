package src.lesson_4;

public class Average {

    public static void main(String[] args) {

        int firstNumber = 3;
        int lastNumber = 17;

        int numbersSum = 0;
        int numbersCount = 0;

        for (int i = firstNumber; i <= lastNumber; ++i) {
            numbersSum = numbersSum + i;
            ++numbersCount;
        }

        double numbersAverage = (double) numbersSum / numbersCount;

        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int i = firstNumber; i <= lastNumber; ++i) {
            if (i % 2 == 0) {
                evenNumbersSum = evenNumbersSum + i;
                ++evenNumbersCount;
            }
        }

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.println("Среднее арифметическое чисел: " + numbersAverage);
        System.out.println("Среднее арифметическое четных чисел: " + evenNumbersAverage);

    }
}