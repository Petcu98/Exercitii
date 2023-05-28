package Ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "fundamentals";
        String[] player = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            if (i == 0 || i == word.length() - 1) {
                System.out.print(word.charAt(i));
                player[i] = word.charAt(i) + "";
            } else {
                player[i] = "_";
                System.out.print("_");
            }
            System.out.print(" ");
        }

        Scanner scanner = new Scanner(System.in);

        do {
            String input = scanner.next();
            if (word.contains(input)) {
                int index = word.indexOf(input);
                player[index] = input;
                showArray(player);

            } else {
                System.out.println("Mai incearca!");
            }

        } while (true);
    }

    public static void showArray(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

    }
}