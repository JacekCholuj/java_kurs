package pl.raiffeisensolutions;


import java.math.BigDecimal;


public class Main {


    public static void main(String[] args) {
        RandomCurrencyRateGenerator generator = new RandomCurrencyRateGenerator();
        BigDecimal from = new BigDecimal("3.5");
        BigDecimal to = new BigDecimal("4.5");
        BigDecimal spreadMin = new BigDecimal("0.00001");
        BigDecimal spreadMax = new BigDecimal("0.5");


        // Mutable version (currency rate fields can be mutated)
        CurrencyRate randomCurrencyRate = generator.getRandomCurrencyRate(
                from,
                to,
                spreadMin,
                spreadMax);
        System.out.println(randomCurrencyRate);


        // Immutable version (currency rate fields are constant, thus easy to reason about and thread safe)
        ImmutableCurrencyRate randomImmutableCurrencyRate = generator.getRandomImmutableCurrencyRate(
                from,
                to,
                spreadMin,
                spreadMax
        );
        System.out.println("dupa: "+randomImmutableCurrencyRate);
    }


}
