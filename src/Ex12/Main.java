package Ex12;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //sa se simuleze jocul piatra foarfeca hartie si sa se stabileasca castigatorul
        // de modificat cod, adaugat 3 runde iar cine ia 2 din 3 castiga
        //inlocuim player 2 cu date introduse de utilizator
        String[] options = {"piatra", "hartie", "foarfeca"};
        Random random = new Random();


        int roundCounter = 1;

        int scorePlayer1 = 0;
        int scorePlayer2 = 0;


        while (roundCounter < 4) {
            System.out.println("Round: " + roundCounter);
            int player1 = random.nextInt(3);
            int player2 = handleUserInput();

            String playerText1 = options[player1];
            String playerText2 = options[player2];
            System.out.println("player 1 are: " + playerText1);
            System.out.println("player 2 are: " + playerText2);
            System.out.println("rezultat: ");

            if (playerText1.equals(playerText2)) {
                System.out.println("egalitate");
            } else if (playerText1.equals("piatra") && playerText2.equals("foarfeca")) {
                System.out.println("player 1 wins");
                scorePlayer1++; // incrementam scorul pentru player 1;
                roundCounter++;
//              scorePlayer1 = scorePlayer1 + 1;
            } else if (playerText1.equals("foarfeca") && playerText2.equals("hartie")) {
                System.out.println("player 1 wins");
                scorePlayer1++;
                roundCounter++;
            } else if (playerText1.equals("hartie") && playerText2.equals("piatra")) {
                System.out.println("player 1 wins ");
                scorePlayer1++;
                roundCounter++;
            } else {
                System.out.println("player2 wins");
                scorePlayer2++;
                roundCounter++;
            }

            System.out.println();
        }

        if (scorePlayer1 > scorePlayer2) {
            System.out.println("Match: Player 1 wins!");
        } else {
            System.out.println("Match: Player 2 wins!");
        }
    }

    public static int handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        //int optiune = 0;
        /* do {
            System.out.println("Tasteaza un numar din lista de mai jos:");
            System.out.println("0 - piatra");
            System.out.println("1 - hartie");
            System.out.println("2 - foarfeca");
            optiune = scanner.nextInt();
            if (optiune > 2) {
                System.out.println("Introduceti o optiune valida!");
            }


        } while (optiune > 2);*/
        int optiune = 0;
        do {
            System.out.println("Alege o optiune: piatra; foarfeca; hartie");
            String input = scanner.nextLine();
            if (input.equals("piatra")) {
                optiune = 0;
                break;
            } else if (input.equals("hartie")) {
                optiune = 1;
                break;
            } else if (input.equals("foarfeca")) {
                optiune = 2;
                break;
            }
        } while (true);

        return optiune;

    }
}

