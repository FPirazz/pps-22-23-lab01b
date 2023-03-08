package e1;

import java.util.Random;

public class ChessboardImpl implements Chessboard {
    private final int gridSize;
    private final ChessPiece pawn;
    private final ChessPiece knight;
    private final Random random = new Random();

    /**
     * This is the first constructor to play a normal game, where the chess pieces
     * are place randomly on the chessboard of size = gridSize
     *
     * @param gridSize
     */
    public ChessboardImpl(final int gridSize) {
        this.gridSize = gridSize;
        this.knight = new Knight( randomEmptyPosition() );
        this.pawn = new Pawn( randomEmptyPosition() );
    }

    /**
     * The second constructor is used to play again a normal game, where the
     * chess pieces are instead placed in specific locations on the board
     *
     * @param gridSize
     * @param knightPosition
     * @param pawnPosition
     */
    public ChessboardImpl(final int gridSize, final Pair<Integer, Integer> knightPosition, Pair<Integer, Integer> pawnPosition) {
        this.gridSize = gridSize;
        this.knight = new Knight( knightPosition );
        this.pawn = new Pawn( pawnPosition );
    }

    /**
     * The function creates random coordinates to assign to the chess pieces on
     * the board, making sure to not place them in the same spot
     *
     * @return a Pair of valid coordinates for the chess piece
     */
    private final Pair<Integer,Integer> randomEmptyPosition(){
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(gridSize),this.random.nextInt(gridSize));
        // the recursive call below prevents clash with an existing pawn
        return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }
    public int getGridSize() {
        return gridSize;
    }
    public ChessPiece getPawn() {
        return pawn;
    }
    public ChessPiece getKnight() {
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
