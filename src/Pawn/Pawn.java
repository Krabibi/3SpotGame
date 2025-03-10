package Pawn;


public class Pawn {
    private String color;
    private int x, y;//coordonnée des pions actuels
    private int dx, dy;// coordonnée des deplacement a faire

    public Pawn(int point, String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public boolean CanMove(int x, int y,String[][] Board) {


        return false;

    }

    public String getColor(){
        return color;
    }


    public void play(int dx, int dy,String[][] Board) {
        if(CanMove(dx,dy, Board)){
            Board[x][y]= " ";
            Board[dx][dy] = color;
        }

    }




}
