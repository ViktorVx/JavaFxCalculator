package calc.calculations;

import calc.calculations.interfaces.ICalculations;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculations implements ICalculations {

    public BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public BigInteger subtract(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public BigInteger multiply(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public BigInteger divide(BigInteger a, BigInteger b) {
        return a.divide(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }


}
