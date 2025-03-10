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
    public void initBoard(Pawn p1, Pawn p2, Pawn neutral) {
        this.Board[0][0] = " ";
        this.Board[0][2] = " ";
        this.Board[0][1] = " ";

        this.Board[2][1] = neutral.getColor();
        this.Board[1][1] = neutral.getColor();


        this.Board[2][0] = p1.getColor();
        this.Board[1][0] = p1.getColor();


        this.Board[1][2] = p2.getColor();
        this.Board[2][2] = p2.getColor();
    }





    public String toString() {
        for(int y=0;y<3;++y){
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
                if(Board[2][y].equals(" ")) {
                    sb.append("O");
                }else
                    sb.append(Board[j][y]);

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
        }
        for(int i = 0 ; i < 13; ++i) {
            sb.append("*");
            sb.append(" ");
        }
        return sb.toString();

    }

}
