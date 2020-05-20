package com.montrell;
public class MarkYourSpot {

    /**
     * Methods
     * @param boardGame
     * @param cell
     * @param player
     */
    public static void MarkYourSpots(char[][] boardGame, int cell, String player) {
        char choice = ' ';
        if (player.equals("player")) {
            choice = 'X';
            App.playerMoves.add(cell);
        } else if (player.equals("computer")) {
            choice = 'O';
            App.computerMoves.add(cell);
        }

        switch (cell) {
            case 1:
                boardGame[0][2] = choice;
                break;
            case 2:
                boardGame[0][4] = choice;
                break;
            case 3:
                boardGame[0][6] = choice;
                break;
            case 4:
                boardGame[1][2] = choice;
                break;
            case 5:
                boardGame[1][4] = choice;
                break;
            case 6:
                boardGame[1][6] = choice;
                break;
            case 7:
                boardGame[2][2] = choice;
                break;
            case 8:
                boardGame[2][4] = choice;
                break;
            case 9:
                boardGame[2][6] = choice;
                break;
            default:
                break;

        }

    }
}
