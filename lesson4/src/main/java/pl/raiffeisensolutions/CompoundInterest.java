package pl.raiffeisensolutions;

import java.math.BigDecimal;

/**
 * Created by rb9310 on 2016-07-26.
 */
public class CompoundInterest {

        BigDecimal principalSum = null;
        BigDecimal nominalInterestRate = null;
        BigDecimal compoundingFrequency = null;
        BigDecimal numberOfYear = null;


    public BigDecimal getPrincipalSum() {
        return principalSum;
    }

    public void setPrincipalSum(BigDecimal principalSum) {
        this.principalSum = principalSum;
    }

    public BigDecimal getNominalInterestRate() {
        return nominalInterestRate;
    }

    public void setNominalInterestRate(BigDecimal nominalInterestRate) {
        this.nominalInterestRate = nominalInterestRate;
    }

    public BigDecimal getCompoundingFrequency() {
        return compoundingFrequency;
    }

    public void setCompoundingFrequency(BigDecimal compoundingFrequency) {
        this.compoundingFrequency = compoundingFrequency;
    }

    public BigDecimal getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(BigDecimal numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    @Override
    public String toString() {
        return "CompoundInterest{" +
                "principalSum=" + principalSum +
                ", nominalInterestRate=" + nominalInterestRate +
                ", compoundingFrequency=" + compoundingFrequency +
                ", numberOfYear=" + numberOfYear +
                '}';
    }

    //        BigDecimal getAccumulatedValue(BigDecimal principalSum, BigDecimal nominalInterestRate, BigDecimal compoundingFrequency, BigDecimal numberOfYear)

    /*public void calculate(int p, int t, int r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        System.out.println("Compond Interest is " + interest);
        System.out.println("Amount is " + amount);*/
}
