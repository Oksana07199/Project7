import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Project7.service.StatsService;

public class StatsServiceTest {
    @Test
    public void testSalesAmount() {  //сумма продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {  //средняя сумма продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinimumMonthsSales() { //номер месяца с минимальными продажами
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (9);
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumMonthsSales() { //номер месяца с максимальными продажами
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverage() { //
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverage() { //
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
