package Ex4;

public class Main {
    public static void main(String[] args) {
        /*
        Sa se calculeze suma primelor 10 numere divizibile cu numarul 5 si cu numarul 2;
         */
        int i = 1;
        int contor = 0;
        int suma = 0;
        while (contor < 10) {
            if (i % 5 == 0 && i % 2 == 0) {
                contor++;
                suma = suma + i;
            }
            i++;
        }
        System.out.println(suma);
    }
}
