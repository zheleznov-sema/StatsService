package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.statSumSale(salesArr);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        long[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.statAvgSale(salesArr);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        StatsService service = new StatsService();
        long[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.statMax(salesArr);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        StatsService service = new StatsService();
        long[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.statMin(salesArr);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBellowAverage() {
        StatsService service = new StatsService();
        long[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.statBellowAverage(salesArr);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverage() {
        StatsService service = new StatsService();
        long[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.statAboveAverage(salesArr);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}
