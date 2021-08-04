package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private StatsService service = new StatsService();

    @Test
    public void totalSum() {
        assertEquals(180, service.totalSum(sales));
    }


    @Test
    void averageSum() {
        assertEquals(15, service.averageSum(sales));

    }

    @Test
    void minSales() {
        assertEquals(9, service.minSales(sales));

    }

    @Test
    void maxSales() {
        assertEquals(8, service.maxSales(sales));

    }

    @Test
    void underAverageSum() {
        int expected = 5;
        int actual = service.underAverageSum(sales);


        assertEquals(5, service.underAverageSum(sales));

    }

    @Test
    void overAverageSum() {
        int expected = 5;
        int actual = service.overAverageSum(sales);


        assertEquals(5, service.overAverageSum(sales));

    }

}



