package Exercitii;

public class DivisionByFiveExample {
    public static void main(String[] args) {
        /*
        Implement the program displaying all the numbers from the range 1 - 100 which are
divisible by 5 beginning from 100 (in reverse order).
         */
        for (int i = 100; i > 0; i = i - 5) {
            System.out.println(i);
        }
    }
}
