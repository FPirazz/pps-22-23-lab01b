package e1;

import java.util.Random;

public class ChessboardImpl implements Chessboard {
    private final int gridSize;
    private final Pawn pawn;
    private final Knight knight;
    private final Random random = new Random();
    public ChessboardImpl(final int gridSize) {
        this.gridSize = gridSize;
        this.knight = new Knight( randomEmptyPosition() );
        this.pawn = new Pawn( randomEmptyPosition() );
    }
    public ChessboardImpl(final int gridSize, final Pair<Integer, Integer> knightPosition, Pair<Integer, Integer> pawnPosition) {
        this.gridSize = gridSize;
        this.knight = new Knight( knightPosition );
        this.pawn = new Pawn( pawnPosition );
    }
    private final Pair<Integer,Integer> randomEmptyPosition(){
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(gridSize),this.random.nextInt(gridSize));
        // the recursive call below prevents clash with an existing pawn
        return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }
    public int getGridSize() {
        return gridSize;
    }
    public Pawn getPawn() {
        return pawn;
    }
    public Knight getKnight() {
        return knight;
    }
    @Override
    public void checkKnightOutOfBounds() {
        Pair<Integer, Integer> knightCoordinates = knight.getCoordinates();
        if (knightCoordinates.getX()<0 || knightCoordinates.getY()<0 ||
                knightCoordinates.getX() >= gridSize || knightCoordinates.getY() >= gridSize) {
            throw new IndexOutOfBoundsException();
        }
    }
}
