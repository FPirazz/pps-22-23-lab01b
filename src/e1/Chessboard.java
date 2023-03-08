package e1;

public interface Chessboard {
    /**
     *
     * @return the size of the chessboard grid
     */
    int getGridSize();

    /**
     *
     * @return the Pawn placed on the chessboard
     */
    ChessPiece getPawn();

    /**
     *
     * @return the Knight placed on the chessboard
     */
    ChessPiece getKnight();

    /**
     * Checks whether the Knight as made a non-valid move, if so launches and IndexOutOfBoundsException
     */
    void checkKnightOutOfBounds();
}
