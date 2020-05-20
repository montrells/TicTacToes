package com.montrell;

import java.util.*;

public class App {

    static ArrayList<Integer> playerMoves = new ArrayList<>( );
    static ArrayList<Integer> computerMoves = new ArrayList<>( );
    public static void main(String[] args) {

        char[][] boardGame =   {{'|', ' ', '_', ' ', '_', ' ', '_', ' ', '|'},
                {'|', ' ', '_', ' ', '_', ' ', '_', ' ', '|'},
                {'|', ' ', '_', ' ', '_', ' ', '_', ' ', '|'}};

        PrintBoardGame print = new PrintBoardGame();
        MarkYourSpot mark = new MarkYourSpot();
        WhoWins wins = new WhoWins();
        print.PrintBoardGames(boardGame);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choice [1-9], Your 'X' and you are playing the computer: ");
            int PlayerChoice = scanner.nextInt( );
            while(playerMoves.contains(PlayerChoice) || computerMoves.contains(playerMoves)){
                System.out.println("Spot Occupied" );
                PlayerChoice = scanner.nextInt();
            }


            mark.MarkYourSpots(boardGame, PlayerChoice, "player");
            String winner = wins.whoWins_();
            if(winner.length() > 0){ //If the players are tied, say so and break out
                System.out.println(winner );

            }

            Random random = new Random( );
            int computerCell = random.nextInt(9) + 1;
            while(playerMoves.contains(computerCell) || computerMoves.contains(computerCell)){ //keep asking and wait your turn
                //System.out.println("Spot Occupied" );
                computerCell = random.nextInt(9) + 1;
            }


            mark.MarkYourSpots(boardGame, computerCell, "computer");
            print.PrintBoardGames(boardGame);
            winner = wins.whoWins_();
            if(winner.length() > 0){ //If the players are tied, say so and break out
                System.out.println(winner );

            }
            System.out.println(winner );
        }




    }





}