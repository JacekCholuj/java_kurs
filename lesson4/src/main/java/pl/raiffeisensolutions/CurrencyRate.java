package pl.raiffeisensolutions;


import java.math.BigDecimal;
import java.math.MathContext;


class CurrencyRate {
    private BigDecimal ask;
    private BigDecimal bid;


    BigDecimal getAsk() {
        return ask;
    }


    void setAsk(BigDecimal ask) {
        this.ask = ask;
    }


    BigDecimal getBid() {
        return bid;
    }


    void setBid(BigDecimal bid) {
        this.bid = bid;
    }


    @Override
    public String toString() {
        MathContext mathContext = new MathContext(5);
        return "CurrencyRate{" +
                "ask=" + ask.round(mathContext) +
                ", bid=" + bid.round(mathContext) +
                '}';
    }




}
