package e1;

import java.util.Objects;

public abstract class ChessPiece {

    private Pair<Integer, Integer> coordinates;

    protected ChessPiece(final Pair<Integer, Integer> coordinates) {
        this.coordinates = coordinates;
    }

    public abstract void move(final int x, final int y);

    public Pair<Integer, Integer> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Pair<Integer, Integer> coordinates) {
        this.coordinates = coordinates;
    }
}
