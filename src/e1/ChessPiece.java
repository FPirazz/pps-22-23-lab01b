package e1;

import java.util.Objects;

public abstract class ChessPiece {
    private Pair<Integer, Integer> coordinates;
    /**
     * Constructor for the chess piece, initialized with its coordinates
     *
     * @param coordinates
     */
    protected ChessPiece(final Pair<Integer, Integer> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Method that tries to move the chess piece, by checking whether
     * the coordinates given are valid for a move
     *
     * @param x
     * @param y
     */
    public abstract void move(final int x, final int y);
    public Pair<Integer, Integer> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Pair<Integer, Integer> coordinates) {
        this.coordinates = coordinates;
    }
}
