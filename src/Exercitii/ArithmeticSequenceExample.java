package Exercitii;

public class ArithmeticSequenceExample {
    public static void main(String[] args) {
        /*
        Implement the program computing the sum of factors from the arithmetic sequence. The
first factor value of the sequence is equal to 5, the difference of each subsequent factor
is equal to 2. We want to sum 459 elements (use ‘for’ loop).
         */
        int sum = 0;
        for (int i = 5; i <= 460 * 2 + 1; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
