package e1;

import java.util.Random;

public class ChessboardImpl implements Chessboard{

    private final int size;
    private final Pair<Integer, Integer> pawn;
    private Pair<Integer, Integer> knight;
    private final Random random = new Random();

    public ChessboardImpl(final int gridSize) {
        this.size = gridSize;
        this.knight = randomEmptyPosition();
        this.pawn = randomEmptyPosition();
    }

    public ChessboardImpl(final int gridSize, final Pair<Integer, Integer> knightPosition, Pair<Integer, Integer> pawnPosition) {
        this.size = gridSize;
        this.knight = randomEmptyPosition();
        this.pawn = randomEmptyPosition();
    }


    private final Pair<Integer,Integer> randomEmptyPosition(){
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
        // the recursive call below prevents clash with an existing pawn
        return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }

    public int getSize() {
        return size;
    }

    public Pair<Integer, Integer> getPawn() {
        return pawn;
    }

    public Pair<Integer, Integer> getKnight() {
        return knight;
    }

    public void setKnight(Pair<Integer, Integer> knight) {
        this.knight = knight;
    }




}
