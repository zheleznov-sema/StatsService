package ru.netology.services;


public class StatsService {
    public long statSumSale(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public double statAvgSale(long[] sales) {
        long avgSale = 0;
        for (long sale : sales) {
            avgSale += sale;
        }
        return avgSale / sales.length;
    }


    public long statMax(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return (long) maxMonth;
    }

    public long statMin(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public long statBellowAverage(long[] sales) {
        double avgSale = statAvgSale(sales);
        long count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSale) {
                count++;
            }
        }
        return count;
    }

    public long statAboveAverage(long[] sales) {
        double avgSale = statAvgSale(sales);
        long count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSale) {
                count++;
            }
        }
        return count;
    }
}