package e1;

public class Pawn extends ChessPiece{
    protected Pawn(Pair<Integer, Integer> coordinates) {
        super(coordinates);
    }
    /**
     * The Pawn in this case doesn't move, because of the nature of
     * the game itself
     *
     * @param x
     * @param y
     */
    @Override
    public void move(int x, int y) {
    }
}
