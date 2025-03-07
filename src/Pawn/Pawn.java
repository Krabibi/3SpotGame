package Pawn;

public class Pawn {
    private char color;
    private int x,y,xx,yy;//coordonnée des pions actuels
    private int dx,dy;// coordonnée des deplacement a faire

    public Pawn(int point, char color, int x, int y, int dx, int dy,int xx, int yy) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    public void GoTo(int x, int y) {

    }




}
