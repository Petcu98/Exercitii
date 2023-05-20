package Exercitii;

public class StringConcatenation {
    public static void main(String[] args) {
        /*
        Please, declare three variables of String type and assign it values. Then declare a fourth
variable of type String which will be a concatenation of previously declared variables and
display its value on the screen. Please do it in two ways:
a) Using ‘+’ operator
b) Using concat() method from String class
        */
        String str1 = "Ana";
        String str2 = " are";
        String str3 = " mere";
        String sum = str1 + str2 + str3;
        System.out.println(sum);

        String sum2 = str1.concat(str2).concat(str3);

        System.out.println(sum2);
    }
}
