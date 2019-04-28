package calc.calculations;

import calc.calculations.interfaces.ICalculations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationsTest {

    @ParameterizedTest
    @MethodSource("longSumProvider")
    void longSum(BigInteger a, BigInteger b, BigInteger sum) {
        assertEquals(sum, ICalculations.sum(a, b));
    }

    private static Stream<Arguments> longSumProvider() {
        return Stream.of(
                Arguments.of(new BigInteger("8"), new BigInteger("4"), new BigInteger("12")),
                Arguments.of(new BigInteger("567"), new BigInteger("12"), new BigInteger("579")),
                Arguments.of(new BigInteger("1000"), new BigInteger("340"), new BigInteger("1340"))
        );
    }






}