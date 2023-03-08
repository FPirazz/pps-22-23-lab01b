package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessPieceTest {

    private static Knight knight;

    @BeforeEach
    void setUp() {
        knight = new Knight(new Pair<>(0, 0));
    }

    @Test
    void testKnigthMovement() {
        assertTrue(knight.getCoordinates().equals(new Pair<>(0, 0)));

        knight.move(1, 1);
        assertFalse(knight.getCoordinates().equals(new Pair<>(1, 1)));
        assertTrue(knight.getCoordinates().equals(new Pair<>(0, 0)));

        knight.move(1, 2);
        assertFalse(knight.getCoordinates().equals(new Pair<>(0, 0)));
        assertTrue(knight.getCoordinates().equals(new Pair<>(1, 2)));
    }
}