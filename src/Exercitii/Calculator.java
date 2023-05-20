package Exercitii;

public class Calculator {
    public static void main(String[] args) {
        /*
        a) Declare and initialize three variables of type int: a, b, c (initialize it to any values)
        b) Store the result of the a - b - c operation in the variable result1 and then display
it on the standard output (screen)
        c) Declare and initialize three variables of type long: d, e, f (initialize it to any
values)
        d) Store the result of the d * e / f operation in the variable result2 and then display it
on the standard output (screen)

         */

        int a, b, c;
        a = 15;
        b = 10;
        c = 5;
        int result1 = a - b - c;
        System.out.println(result1);

        long d, e, f;
        d = 55L;
        e = 15L;
        f = 3L;
        long result2 = d * e / f;
        System.out.println(result2);

    }
}
