package pl.raiffeisensolutions;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by rb9310 on 2016-07-26.
 */
public class MainCompoundInterest {
    public static void main(String[] args) {
        BigDecimal principalSum = new BigDecimal("3400.00"); //p
        BigDecimal nominalInterestRate = new BigDecimal("4.00");//i
        BigDecimal compoundingFrequency = new BigDecimal("2.00");//n
        BigDecimal numberOfYear = new BigDecimal("3.00"); //t
        BigDecimal wynik = new BigDecimal("0.00");
        BigDecimal potega = new BigDecimal("0.00");

        CompoundInterest compoundInterest = new CompoundInterest();
        compoundInterest.setPrincipalSum(principalSum);
        compoundInterest.setNominalInterestRate(nominalInterestRate);
        compoundInterest.setCompoundingFrequency(compoundingFrequency);
        compoundInterest.setNumberOfYear(numberOfYear);
        System.out.println(compoundInterest);


        potega = compoundingFrequency.multiply(numberOfYear);
        wynik = ((BigDecimal.ONE.add(nominalInterestRate.divide(compoundingFrequency,2))).pow(potega.intValue()).setScale(0,RoundingMode.DOWN)).multiply(principalSum);
        System.out.println(wynik);





    }
}
