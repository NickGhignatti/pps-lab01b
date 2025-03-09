package e2;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LogicTest {
    private final int BOARD_SIZE = 5;
    private Logics logic;

    @BeforeEach
    void init() {
        this.logic = new LogicsImpl(this.BOARD_SIZE);
    }

    private Pair<Integer, Integer> getCurrentKnightPosition() {
        for (int i = 0; i < this.BOARD_SIZE; i++) {
            for (int j = 0; j < this.BOARD_SIZE; j++) {
                if (this.logic.hasKnight(i, j)) {
                    return new Pair<>(i, j);
                }
            }
        }
        return new Pair<>(-1, -1);
    }

    private Pair<Integer, Integer> getCurrentPawnPosition() {
        for (int i = 0; i < this.BOARD_SIZE; i++) {
            for (int j = 0; j < this.BOARD_SIZE; j++) {
                if (this.logic.hasPawn(i, j)) {
                    return new Pair<>(i, j);
                }
            }
        }
        return new Pair<>(-1, -1);
    }

    @Test
    public void knightHasBeenCreated() {
        for (int i = 0; i < this.BOARD_SIZE; i++) {
            for (int j = 0; j < this.BOARD_SIZE; j++) {
                if (this.logic.hasKnight(i, j)) {
                    assertTrue(true);
                }
            }
        }
        assertFalse(false);
    }

    @Test
    public void pawnHasBeenCreated() {
        for (int i = 0; i < this.BOARD_SIZE; i++) {
            for (int j = 0; j < this.BOARD_SIZE; j++) {
                if (this.logic.hasPawn(i, j)) {
                    assertTrue(true);
                }
            }
        }
        assertFalse(false);
    }

    @Test
    public void checkCorrectKnightHit() {
        Pair<Integer, Integer> currentPawnPos = getCurrentPawnPosition();
        assertTrue(this.logic.hit(currentPawnPos.getX(), currentPawnPos.getY()));
    }

    @Test
    public void checkKnightOutOfBound() {
        assertThrows(IndexOutOfBoundsException.class, () -> this.logic.hit(BOARD_SIZE, BOARD_SIZE));
    }
}
