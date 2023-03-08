package e1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessboardTest {
    private static Chessboard chessboard;
    @BeforeAll
    static void beforeAll() {
        chessboard = new ChessboardImpl(5, new Pair<>(0, 0), new Pair<>(1, 2));
    }
    @Test
    void checkNonValidKnightMovement() {
        chessboard.getKnight().move(-1, -2);
        assertThrows( IndexOutOfBoundsException.class,
                () -> chessboard.checkKnightOutOfBounds(),
                "Invalid knight movement out of the board for negative coordinates"
        );

        chessboard.getKnight().move(chessboard.getGridSize() + 1, chessboard.getGridSize() + 1);
        assertThrows( IndexOutOfBoundsException.class,
                () -> chessboard.checkKnightOutOfBounds(),
                "Invalid knight movement out of the board for out of bounds coordinates"
        );
    }
}