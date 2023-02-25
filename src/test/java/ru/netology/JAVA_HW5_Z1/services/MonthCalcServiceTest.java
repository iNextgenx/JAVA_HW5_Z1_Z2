package ru.netology.JAVA_HW5_Z1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// import ru.netology.JAVA_HW5_Z1.services.MonthCalcService;

public class MonthCalcServiceTest {
    @Test
    public void testVar1() {
        MonthCalcService service = new MonthCalcService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
        //Вывод количества месяцев для проверки
        //System.out.println("За год отдохнем месяцев: " + actual);

    }

    @Test
    public void testVar2() {
        MonthCalcService service = new MonthCalcService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
        //Вывод количества месяцев для проверки
        //System.out.println("За год отдохнем месяцев: " + actual);

    }
}
