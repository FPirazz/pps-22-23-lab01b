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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessPiece that = (ChessPiece) o;
        return coordinates.equals(that.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates);
    }
}
