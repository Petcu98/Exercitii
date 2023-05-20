package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Sa se introduca de la tastatura doua numere a si b;
        Sa se calculeze suma,diferenta, produsul, impartirea celor doua numere;
        Pentru fiecare operatie sa existe metode separate;
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti numarul b: ");
        int b = scanner.nextInt();

        while (0 < 1) {
            printMessage();
            int optiune = scanner.nextInt();
            if (optiune == 0) {
                System.out.println("Multumim!");
                break;
            }

            switch (optiune) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    diff(a, b);
                    break;
                case 3:
                    prod(a, b);
                    break;
                case 4:
                    impartire(a, b);
                    break;
                default:
                    System.out.println("optiune incorecta!");
            }
        }
    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void diff(int a, int b) {
        int diff = a - b;
        System.out.println("Diff: " + diff);
    }

    public static void prod(int a, int b) {
        int prod = a * b;
        System.out.println("Prod: " + prod);
    }

    public static void impartire(int a, int b) {
        int impartire = a / b;
        System.out.println("Impartire: " + impartire);
    }

    public static void printMessage() {
        System.out.println("Selectati o optiune de mai jos:");
        System.out.println("1. adunare");
        System.out.println("2. scadere");
        System.out.println("3. inmultire");
        System.out.println("4. impartire");
        System.out.println("0. iesire");
    }
}

