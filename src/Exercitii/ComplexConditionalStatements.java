package Exercitii;

public class ComplexConditionalStatements {
    public static void main(String[] args) {
        /*
        Declare an integer variable and assign any value to it. Next check, if the value of this
variable is greater, or less, or equal to zero. In every case, please display the proper
information on the screen. Please use conditional statement construction.
         */
        int i = 0;
        if (i > 0) {
            System.out.println("i este mai mare decat 0");
        } else if (i < 0) {
            System.out.println("i este mai mic decat 0");
        } else {
            System.out.println("i este egal cu 0");
        }
    }
}
