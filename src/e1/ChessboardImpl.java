package e1;

import java.util.Random;

public class ChessboardImpl implements Chessboard {

    private final int size;
    private final Pawn pawn;
    private final Knight knight;
    private final Random random = new Random();

    public ChessboardImpl(final int gridSize) {
        this.size = gridSize;
        this.knight = new Knight( randomEmptyPosition() );
        this.pawn = new Pawn( randomEmptyPosition() );
    }

    public ChessboardImpl(final int gridSize, final Pair<Integer, Integer> knightPosition, Pair<Integer, Integer> pawnPosition) {
        this.size = gridSize;
        this.knight = new Knight( knightPosition );
        this.pawn = new Pawn( pawnPosition );
    }


    private final Pair<Integer,Integer> randomEmptyPosition(){
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
        // the recursive call below prevents clash with an existing pawn
        return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }

    public int getSize() {
        return size;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public Knight getKnight() {
        return knight;
    }

}
