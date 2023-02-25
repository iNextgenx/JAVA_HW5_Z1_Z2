package ru.netology.JAVA_HW5_Z1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class MonthCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    public void testParametrized(int expected, int income, int expenses, int threshold) {
        MonthCalcService service = new MonthCalcService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
