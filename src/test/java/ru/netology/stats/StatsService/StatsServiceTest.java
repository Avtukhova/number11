package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void totalSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.totalSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSum(sales);

        assertEquals(expected, actual);

    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.minSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected1 = 5;
        int expected2 = 7;
        int actual = service.maxSales(sales);


        assertEquals(expected1, expected2, actual);

    }

    @Test
    void underAverageSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.underAverageSum(sales);


        assertEquals(expected, actual);

    }

    @Test
    void overAverageSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.overAverageSum(sales);


        assertEquals(expected, actual);

    }

}



