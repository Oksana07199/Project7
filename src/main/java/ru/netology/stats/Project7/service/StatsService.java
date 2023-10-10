package ru.netology.stats.Project7.service;

public class StatsService {

    public long salesAmount(long[] sales) { //сумма всех продаж
        long theAmount = 0;
        for (long sale : sales) {
            theAmount += sale;
        }

        return theAmount;
    }

    public long average(long[] sales) {   //средняя сумма продаж
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / sales.length;

        return averageSale;
    }

    public int minSales(int[] sales) {  //номер месяца с минимальными продажами
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i; //
            }
        }
        return minMonth + 1; //
    }


    public int maxSales(int[] sales) { //номер месяца с максимальными продажами
        int maxMonth = 0; //
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) { //кол-во месяцев, в которых продажи ниже среднего
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(long[] sales) { //кол-во месяцев, в которых продажи выше среднего
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}