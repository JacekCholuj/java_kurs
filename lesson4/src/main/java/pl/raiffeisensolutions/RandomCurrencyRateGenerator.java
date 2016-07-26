package pl.raiffeisensolutions;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


class RandomCurrencyRateGenerator {
    private static final int PRECISION_FROM_ACCOUNTANT = 5;
    private static final BigDecimal TWO = new BigDecimal("2.0");


    private BigDecimal divideByTwoRoundingUp(BigDecimal spread) {
        return spread.divide(
                TWO,
                new MathContext(PRECISION_FROM_ACCOUNTANT, RoundingMode.HALF_UP));
    }


    CurrencyRate getRandomCurrencyRate(
            BigDecimal from,
            BigDecimal to,
            BigDecimal spreadMin,
            BigDecimal spreadMax) {
        BigDecimal halfOfRandomSpread = getRandomHalfOfSpread(spreadMin, spreadMax);
        BigDecimal currencyRateCenter = getRandomMarketCenter(from, to);


        BigDecimal bid = currencyRateCenter.add(halfOfRandomSpread);
        BigDecimal ask = currencyRateCenter.subtract(halfOfRandomSpread);


        CurrencyRate currencyRate = new CurrencyRate();
        currencyRate.setAsk(ask);
        currencyRate.setBid(bid);


        return currencyRate;
    }


    ImmutableCurrencyRate getRandomImmutableCurrencyRate(
            BigDecimal from,
            BigDecimal to,
            BigDecimal spreadMin,
            BigDecimal spreadMax) {
        BigDecimal halfOfRandomSpread = getRandomHalfOfSpread(spreadMin, spreadMax);
        BigDecimal currencyRateCenter = getRandomMarketCenter(from, to);


        BigDecimal bid = currencyRateCenter.add(halfOfRandomSpread);
        BigDecimal ask = currencyRateCenter.subtract(halfOfRandomSpread);


        return new ImmutableCurrencyRate(ask, bid);
    }


    private BigDecimal getRandomHalfOfSpread(BigDecimal spreadMin, BigDecimal spreadMax) {
        return divideByTwoRoundingUp(
                RandomNumbersGenerator.getRandomBetween(
                        spreadMin,
                        spreadMax));
    }


    private BigDecimal getRandomMarketCenter(BigDecimal from, BigDecimal to) {
        return RandomNumbersGenerator.getRandomBetween(
                from,
                to);
    }
}
