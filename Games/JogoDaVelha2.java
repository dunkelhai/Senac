package Games;

import java.util.*;

public class JogoDaVelha2 {

    private static String[] board = new String[9];
    private static String turn = "A";

    public static void main(String[] args) {

        String winner = null;
        populateEmptyBoard();

        System.out.println("Welcome to 2 Player Tic Tac Toe.");
        System.out.println("--------------------------------");
        printBoard();
        System.out.println("A's will play first. Enter a slot number to place A in:");

        try (Scanner in = new Scanner(System.in)) {
            while (winner == null) {
                int numInput;
                try {
                    numInput = in .nextInt();
                    if (!(numInput > 0 && numInput <= 9)) {
                        System.out.println("Invalid input; re-enter slot number:");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
                if (board[numInput - 1].equals(String.valueOf(numInput))) {
                    board[numInput - 1] = turn;
                    if (turn.equals("A")) {
                        turn = "B";
                    } else {
                        turn = "A";
                    }
                    printBoard();
                    winner = checkWinner();
                } else {
                    System.out.println("Slot already taken; re-enter slot number:");
                    continue;
                }
            }
            if (winner.equalsIgnoreCase("draw")) {
                System.out.println("It's a draw! Thanks for playing.");
            } else {
                System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
            }
        }
    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("AAA")) {
                return "A";
            } else if (line.equals("BBB")) {
                return "B";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8)
                return "draw";
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    private static void printBoard() {
        String createBoard = "/---|---|---\\ \n" + "| " + board[0] + " | " + board[1] + " | " + board[2] + " | \n" +
                "|-----------| \n" + "| " + board[3] + " | " + board[4] + " | " + board[5] + " | \n" +
                "|-----------| \n" + "| " + board[6] + " | " + board[7] + " | " + board[8] + " | \n" +
                "/---|---|---\\ \n";
        System.out.println(createBoard);
    }

    private static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
    }
}
