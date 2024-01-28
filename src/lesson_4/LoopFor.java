package src.lesson_4;

public class LoopFor {

    public static boolean isNumberMultipleFour(int number) {
        return number % 4 == 0;
    }

    public static void main(String[] args) {

        int firstNumber = 1;
        int lastNumber = 100;

        for (int i = lastNumber; i >= firstNumber; --i) {
            if (isNumberMultipleFour(i)) {
                System.out.println(i);
            }
        }
    }
}