package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicsTest {

    private static final int gridSize = 4;
    private static final Pair<Integer, Integer> knightPosition = new Pair<>(0, 0);
    private static final Pair<Integer, Integer> pawnPosition = new Pair<>(1, 2);
    private Logics logic;

    @BeforeEach
    void setUp() {
        logic = new LogicsImpl(gridSize, knightPosition, pawnPosition);
    }

    @Test
    void havePiecesBeenPlaced() {
        assertTrue( logic.hasKnight(0, 0) );
        assertTrue( logic.hasPawn(1, 2) );

        assertFalse( logic.hasKnight(3, 2) );
        assertFalse( logic.hasPawn(1, 4) );
    }

    @Test
    void checkNonValidKnightMovement() {
        assertThrows( IndexOutOfBoundsException.class,
                () -> logic.hit(-1, -1),
                "Invalid knight movement out of the board for negative coordinates"
        );

        assertThrows( IndexOutOfBoundsException.class,
                () -> logic.hit(gridSize + 1, gridSize + 1),
                "Invalid knight movement out of the board for out of bounds coordinates"
        );

    }

    @Test
    void checkKnightGetsPawn() {
        assertFalse( logic.hit(2, 1) );
        assertFalse( logic.hit(3, 3) );
        assertTrue( logic.hit(1, 2) );
    }

}