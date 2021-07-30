package ru.netology.stats.StatsService;

public class StatsService {
    public int totalSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }


    public int averageSum(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            average = sum / sales.length;
        }
        return average;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth;
    }

    public int maxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }

            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth;
    }



    public int underAverageSum(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            average = sum / sales.length;
        }

        int saleMonth = 0;
        int countsaleMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                countsaleMonth++;
            }
        }
        return countsaleMonth;


    }

    public int overAverageSum(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            average = sum / sales.length;
        }

        int saleMonth = 0;
        int countsaleMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                countsaleMonth++;
            }
        }
        return countsaleMonth;


    }

}



























































