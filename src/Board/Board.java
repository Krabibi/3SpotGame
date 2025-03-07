package Board;
import java.util.LinkedList;
import Pawn.Pawn;

public class Board {

    private int length, height;
    private LinkedList<Pawn> pawns;
    private String[][] Board;
    StringBuilder sb = new StringBuilder();





    public Board(int length, int height) {
        this.length = length;
        this.height = height;
        this.pawns = new LinkedList<Pawn>();
        this.Board = new String[length][height];
    }

    /*Placement des pions*/
    public void initBoard() {
        this.Board[0][0] = " ";
        this.Board[0][2] = " ";
        this.Board[0][1] = " ";

        this.Board[2][1] = "W";
        this.Board[1][1] = "W";


        this.Board[2][0] = "B";
        this.Board[1][0] = "B";


        this.Board[1][2] = "R";
        this.Board[2][2] = "R";
    }





    public String toString() {

        for(int i = 0 ; i < 13; ++i) {
            sb.append("*");
            sb.append(" ");
        }
        sb.append("\n");
        for(int k = 0 ; k < 4; ++k) {
            sb.append("*");
            for(int i = 0 ; i < 7; ++i) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        for(int j = 0 ; j < 3; ++j) {
            sb.append("*");
            sb.append("   ");
            sb.append(Board[j][0]);
            sb.append("   ");

        }
        sb.append("*");
        sb.append("\n");
        for(int k = 0 ; k < 4; ++k) {
            sb.append("*");
            for(int i = 0 ; i < 7; ++i) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        for(int i = 0 ; i < 13; ++i) {
            sb.append("*");
            sb.append(" ");
        }

        /******************************************************************************/


        sb.append("\n");
        for(int k = 0 ; k < 4; ++k) {
            sb.append("*");
            for(int i = 0 ; i < 7; ++i) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        for(int j = 0 ; j < 3; ++j) {
            sb.append("*");
            sb.append("   ");
            sb.append(Board[j][1]);
            sb.append("   ");

        }

        sb.append("*");
        sb.append("\n");
        for(int k = 0 ; k < 4; ++k) {
            sb.append("*");
            for(int i = 0 ; i < 7; ++i) {
                sb.append(" ");
            }
        }

        /**************************************************************/


        sb.append("\n");
        for(int i = 0 ; i < 13; ++i) {
            sb.append("*");
            sb.append(" ");
        }
        sb.append("\n");

        for(int k = 0 ; k < 4; ++k) {
            sb.append("*");
            for(int i = 0 ; i < 7; ++i) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        for(int j = 0 ; j < 3; ++j) {
            sb.append("*");
            sb.append("   ");
            sb.append(Board[j][2]);
            sb.append("   ");

        }
        sb.append("*");
        sb.append("\n");
        for(int k = 0 ; k < 4; ++k) {
            sb.append("*");
            for(int i = 0 ; i < 7; ++i) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        for(int i = 0 ; i < 13; ++i) {
            sb.append("*");
            sb.append(" ");
        }
        return sb.toString();
    }






}
