package Game;

import Board.Board;
import Pawn.Pawn;

public class Game {

    public static void main(String[] args) {
        Board bd = new Board(3,3);
        Pawn p1 = new Pawn(0,"B",1,2);
        Pawn p2 = new Pawn(0,"R",2,2);
        Pawn neutral = new Pawn(0,"W",2,2);
        bd.initBoard(p1,p2,neutral);
    }



}
