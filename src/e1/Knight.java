package e1;

public class Knight extends ChessPiece {
    protected Knight(Pair<Integer, Integer> coordinates) {
        super(coordinates);
    }
    @Override
    public void move(int row, int col) {
        // Below a compact way to express allowed moves for the knight
        int x = row-this.getCoordinates().getX();
        int y = col-this.getCoordinates().getY();

        if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
            this.setCoordinates(new Pair<>(row, col));
        }
    }
}
