package pl.raiffeisensolutions;


import java.math.BigDecimal;


class RandomNumbersGenerator {
    static BigDecimal getRandomBetween(BigDecimal from, BigDecimal to) {
        return from.add(
                getShift(from, to));
    }


    private static BigDecimal getShift(BigDecimal from, BigDecimal to) {
        return getDifference(from, to)
                .multiply(
                        getRandomBigDecimal());
    }


    private static BigDecimal getDifference(BigDecimal from, BigDecimal to) {
        return to.subtract(from);
    }


    private static BigDecimal getRandomBigDecimal() {
        return new BigDecimal(Math.random());
    }
}
