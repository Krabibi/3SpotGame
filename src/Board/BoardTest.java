package Board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BoardTest {

    @Test
    void testToString() {
        Board bd = new Board(3,3);
        bd.initBoard();
        System.out.println(bd.toString());
    }
}