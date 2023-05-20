package Ex8;

public class Main {
    public static void main(String[] args) {
        /*
        Sa se afiseze fiecare caracter dintr-un string;
         */
        String txt = "Ana are mere.";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            System.out.println(c);
        }
    }
}
