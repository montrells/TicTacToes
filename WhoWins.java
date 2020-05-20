package com.montrell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhoWins {
    public static String whoWins_(){
        List horizTop = Arrays.asList(1,2,3);
        List horizMiddle = Arrays.asList(4,5,6);
        List horizBottom = Arrays.asList(7,8,9);
        List verticalLeft = Arrays.asList(1,4,7);
        List verticalMiddle = Arrays.asList(2,5,8);
        List verticalRight = Arrays.asList(3,6,9);
        List rightCross = Arrays.asList(1,5,9);
        List leftCross = Arrays.asList(3,5,7);

        List<List> wins = new ArrayList<>();
        wins.add(horizTop);
        wins.add(horizMiddle);
        wins.add(horizBottom);
        wins.add(verticalLeft);
        wins.add(verticalMiddle);
        wins.add(verticalRight);
        wins.add(rightCross);
        wins.add(leftCross);

        for(List list : wins){
            if(App.playerMoves.containsAll(list)){
                return "We have a WINNER!";
            }else if (App.computerMoves.containsAll(list)){
                return "You Lossed!";
            }else if(App.playerMoves.size() + App.computerMoves.size() == 9){
                return "TIED";
            }
        }
        return " ";

    }
}
