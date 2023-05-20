package Exercitii;

public class CastExample {
    public static void main(String[] args) {
        /*
        Implement the program, where you have to:
a) Declare and initialize two variables: intVar1, intVar2 of int type
b) Declare variable shortSum of short type and initialize it as the sum of previously
declared variables (intVar1 + intVar2)
c) Display on the screen the value stored in shortSum variable
d) Next, display on the screen the result of the incrementation: shortSum++
e) Declare variable byteSum of byte type and initialize it as the sum of previously
declared variables (intVar1 + intVar2)
f) Display on the screen the value stored in byteSum variable
g) Next, display on the screen the result of the incrementation: ++byteSum
         */

        int intVar1, intVar2;
        intVar1 = 12;
        intVar2 = 15;
        short shortSum = (short) (intVar1 + intVar2);
        System.out.println(shortSum);
        shortSum++;
        System.out.println(shortSum);
        byte byteSum = (byte) shortSum;
        System.out.println(byteSum);
        ++byteSum;
        System.out.println(byteSum);


    }
}
