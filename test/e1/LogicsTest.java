package e1;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicsTest {
    private static final int gridSize = 4;
    private Logics logic;
    @BeforeEach
    void setUp() {
        logic = new LogicsImpl(gridSize, new Pair<>(0, 0), new Pair<>(1, 2));
    }
    @Test
    void havePiecesBeenPlaced() {
        assertTrue( logic.hasKnight(0, 0) );
        assertTrue( logic.hasPawn(1, 2) );

        assertFalse( logic.hasKnight(3, 2) );
        assertFalse( logic.hasPawn(1, 4) );
    }
    @Test
    void checkKnightGetsPawn() {
        assertTrue( logic.hasKnight(0, 0) );

        assertFalse( logic.hit(2, 1) );
        assertTrue( logic.hasKnight(2, 1) );

        assertFalse( logic.hit(3, 3) );
        assertTrue( logic.hasKnight(3, 3) );

        assertTrue( logic.hit(1, 2) );
        assertTrue( logic.hasKnight(1, 2) );
    }
}