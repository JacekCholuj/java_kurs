package pl.raiffeisensolutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

class AverageSalaryCalculator {
    private final NumberFormat currencyInstance;


    AverageSalaryCalculator(Locale locale) {
        NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance(locale);
        ((DecimalFormat) currencyInstance).setParseBigDecimal(true);
    }


    BigDecimal calculate(String inputFile) {
        // TODO use the other methods to calculate average salary. There is no need to use variables here.
        try {
            return calculateAverage(
                    parseSalaries(
                            getSalaryColumn(
                                    removeHeader(
                                            readLines(inputFile)))));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private BigDecimal calculateAverage(List<BigDecimal> salaries) {
        // TODO calculate average of the passed salaries
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal salary : salaries) {
            sum.add(salary);
            BigDecimal divide = sum.divide(BigDecimal.valueOf(salaries.size()), new MathContext(2, RoundingMode.HALF_UP));
        }
    }


    private List<BigDecimal> parseSalaries(List<String> salaryStrings) {
        // TODO return BigDecimal representation of the salary
        ArrayList<BigDecimal> parsed = new ArrayList<>();
        for (String stringToParse : salaryStrings) {
            parsed.add(getParsedSalary(stringToParse));
        }
        return parsed;
    }

    private BigDecimal getParsedSalary(String salaryString) {
        // to po pawle a dodane
        try {
            return (BigDecimal) currencyInstance.parse(salaryString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    private List<String> getSalaryColumn(List<String> csvLinesWithoutHeader) {
        // TODO trim all the lines ton contain only salary column i.e. from every line in format "John Smith;999999" create "999999"
        List<String> arr = new ArrayList<>();
        for (String line : csvLinesWithoutHeader)
            arr.add(line.split(";")[1]);
        return arr;
    }


    private List<String> removeHeader(List<String> lines) {
        // TODO remove the first line of the file containing the header
        lines.remove(lines.get(0));
        return lines;
    }


    private List<String> readLines(String inputFile) throws IOException {
        // TODO read all the lines of the file and store them as a list
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        List<String> lines = new ArrayList<String>();
        String line = reader.readLine();
        while (line != null) {
            lines.add(line);
        }
        return lines;
    }
}