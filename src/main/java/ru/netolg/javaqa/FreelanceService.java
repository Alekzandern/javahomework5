package ru.netolg.javaqa;
public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                //rest
                money -= expenses;
                money /= 3;
                count ++;

            } else {
                //job
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
