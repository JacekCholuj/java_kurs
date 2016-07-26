package pl.raiffeisensolutions;


import java.math.BigDecimal;
import java.math.MathContext;


class ImmutableCurrencyRate {
    private BigDecimal ask;
    private BigDecimal bid;


    ImmutableCurrencyRate(BigDecimal ask, BigDecimal bid) {
        this.ask = ask;
        this.bid = bid;
    }


    public BigDecimal getAsk() {
        return ask;
    }


    public BigDecimal getBid() {
        return bid;
    }


    @Override
    public String toString() {
        MathContext mathContext = new MathContext(5);
        return "CurrencyRate1{" +
                "ask=" + ask.round(mathContext) +
                ", bid=" + bid.round(mathContext) +
                '}';
    }




}
