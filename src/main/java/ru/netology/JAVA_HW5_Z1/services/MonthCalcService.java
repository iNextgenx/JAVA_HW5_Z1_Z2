package ru.netology.JAVA_HW5_Z1.services;
public class MonthCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        double money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) - ((money - expenses) / 3 * 2);
            } else {
                money = money + income - expenses;
            }
            //Вывод значений по месяцам для проверки
            //System.out.println("Месяц " + (month+1) +" Остаток денег " + (int)money);
        }
        return count;

    }
}
