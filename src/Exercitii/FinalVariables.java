package Exercitii;

public class FinalVariables {
    public static void main(String[] args) {
        /*
        Please, implement the program, where you will declare and initialize several final
variables of various types having any names. Next, try to display them in the following
lines of text. Compile it and check what will happen, when you try to set the value again
for any previously declared final variable
         */
        final int finalInt = 5;
        final String finalString = "This is a test";
        final boolean finalBoolean = false;
        final long finalLong = 544L;
        final float finalFloat = 132f;

        System.out.println(finalInt);
        System.out.println(finalBoolean);
        System.out.println(finalString);
        System.out.println(finalLong);
        System.out.println(finalFloat);
    }
}
