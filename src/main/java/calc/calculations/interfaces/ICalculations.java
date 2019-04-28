package calc.calculations.interfaces;

import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface ICalculations {

    static BigInteger sum(@NotNull BigInteger a, BigInteger b){
        return a.add(b);
    };
    static BigDecimal sum(@NotNull BigDecimal a, BigDecimal b){ return a.add(b); };

    BigInteger subtract(BigInteger a, BigInteger b);
    BigDecimal subtract(BigDecimal a, BigDecimal b);

    BigInteger multiply(BigInteger a, BigInteger b);
    BigDecimal multiply(BigDecimal a, BigDecimal b);

    BigInteger divide(BigInteger a, BigInteger b);
    BigDecimal divide(BigDecimal a, BigDecimal b);



}
