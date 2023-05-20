package Exercitii;

public class StringComparing {
    public static void main(String[] args) {
        /*
        Declare two variables of String type and next please declare the boolean variable,
which will store the result of checking if two previously declared String values are equal
(Hint: use equals() method from String class). Display boolean value on the standard
output (screen).
         */
        String string1 = "Aparate pe curent";
        String string2 = "golden brau";
        boolean saVedem = string1.equals(string2);
        System.out.println(saVedem);
    }
}
