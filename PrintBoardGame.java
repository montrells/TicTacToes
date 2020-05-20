package com.montrell;

public class PrintBoardGame {
    /**
     * Methods
     * @param boardGame
     */
    public static void PrintBoardGames(char[][] boardGame){
        System.out.println("---------");
        for (char[] row : boardGame) {
            for (char c : row) { //print the char for each row
                System.out.print(c);
            }
            System.out.println( );
        }
        System.out.println("---------");
    }
}
