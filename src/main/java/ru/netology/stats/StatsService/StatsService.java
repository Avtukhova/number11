package ru.netology.stats.StatsService;

public class StatsService {
    public int totalSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSum(int[] sales) {
        return totalSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = sales[0];
        for (int sale : sales) {
            if (sale < minMonth) {
                minMonth = sale;
            }

        }
        int monthCount = 0;
        int minSales = 0;
        for (int sale : sales) {
            monthCount = monthCount + 1;
            if (sale == minMonth) {
                minSales = monthCount;

            }
        }
        return minSales;

    }

    public int maxSales(int[] sales) {
        int maxMonth = sales[0];
        for (int sale : sales) {
            if (sale > maxMonth) {
                maxMonth = sale;
            }

        }
        int monthCount = 0;
        int maxSales = 0;
        for (int sale : sales) {
            monthCount = monthCount + 1;
            if (sale == maxMonth) {
                maxSales = monthCount;
            }

        }
        return maxSales;
    }

    public int underAverageSum(int[] sales) {
        int average = averageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < average)
                monthCount++;
        }

        return monthCount;

    }

    public int overAverageSum(int[] sales) {
        int average = averageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average)
           monthCount++;
        }

        return monthCount;

    }



    }





























































