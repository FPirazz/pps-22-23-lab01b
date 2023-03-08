package e1;

public interface Logics{
    /**
     * attempt to move Knight on position row,col, if possible
     * 
     * @param row
     * @param col
     * @return whether the Knight got the Pawn or not
     */
    boolean hit(int row, int col);

    /**
     * @param row
     * @param col
     * @return whether position row,col has the Knight
     */
    boolean hasKnight(int row, int col);

    /**
     * @param row
     * @param col
     * @return whether position row,col has the Pawn
     */
    boolean hasPawn(int row, int col);
}
