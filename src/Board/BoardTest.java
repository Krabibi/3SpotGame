package Board;

import org.junit.jupiter.api.Test;
import Pawn.Pawn;

class BoardTest {

    @Test
    void testToString() {
        Board bd = new Board(3,3);
        Pawn p1 = new Pawn(0,"B",1,2);
        Pawn p2 = new Pawn(0,"R",2,2);
        Pawn neutral = new Pawn(0,"W",2,2);
        bd.initBoard(p1,p2,neutral);
        System.out.println(bd.toString());

    }
}