package e1;

public interface Chessboard {
    int getGridSize();
    Pawn getPawn();
    Knight getKnight();
    void checkKnightOutOfBounds();
}
