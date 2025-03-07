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
            if(Board[j][0].equals("R")){
                sb.append("R");
            }
            else if(Board[j][0].equals("W")){
                sb.append("W");
            }
            else if(Board[j][0].equals("B")){
                sb.append(Board[j][0]);
            }else if (Board[j][0].equals("O")){
                sb.append("O");
            }else
                sb.append(" ");

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
            if(Board[j][1].equals("R")){
                sb.append("R");
            }
            else if(Board[j][1].equals("W")){
                sb.append("W");
            }
            else if(Board[j][1].equals("B")){
                sb.append("B");
            }else if (Board[j][1].equals("O")){
                sb.append("O");
            }else
                sb.append(" ");

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
        for(int j = 0 ; j <= 2; ++j) {
            sb.append("*");
            sb.append("   ");
            if(Board[j][2].equals("R")){
                sb.append("R");
            }
            else if(Board[j][2].equals("W")){
                sb.append("W");
            }
            else if(Board[j][2].equals("B")){
                sb.append("B");
            }else if (Board[j][2].equals("O")){
                sb.append("O");
            }else
                sb.append(" ");

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
