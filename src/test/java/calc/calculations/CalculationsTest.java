package calc.calculations;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(12, Calculations.sum(8, 4));
        assertEquals(579, Calculations.sum(567, 12));
        assertEquals(1340, Calculations.sum(1000, 340));
    }
}