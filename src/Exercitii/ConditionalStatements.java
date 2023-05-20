package Exercitii;

public class ConditionalStatements {
    public static void main(String[] args) {
        /*
        Please, declare an integer variable and assign any value to this variable. Then using a
conditional statement check if it is an even number. If yes, please display proper
information on the screen.
         */
        int int1 = 126;
       /* if (int1 % 2 == 0) {
            System.out.println("Este un numar par"); */

        /*
            Please, modify the program from the previous exercise adding proper information in
case the number is odd (Hint: use another conditional statement construction)
         */
        if (int1 % 2 == 0) {
            System.out.println("int1 este numar par");


        } else {
            System.out.println("int1 este numar impar");
        }
    }
}
