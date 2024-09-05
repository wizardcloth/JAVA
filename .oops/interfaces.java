public class interfaces {
    public static void main(String[] args) {
        king p1 = new king();
        p1.moves();
    }

}
interface ChessPlayer {
    void moves();   // by default public anot Defalult
}
class queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,left,right,down,diagonal");
    }
}
class king implements ChessPlayer{
    public void moves(){
        System.out.println("up,left,right,down");
    }
}
