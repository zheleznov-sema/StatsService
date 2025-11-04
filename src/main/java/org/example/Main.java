package org.example;
import ru.netology.services.StatsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] summa = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sumSale = service.statSumSale(summa);
        double avgSale = service.statAvgSale(summa);
        long maxSale = service.statMax(summa);
        long minSale = service.statMin(summa);
        long bellowAverage = service.statBellowAverage(summa);
        long abboveAverage = service.statAboveAverage(summa);

        System.out.println("Сумма чисел в массиве равна" + " " + sumSale);
        System.out.println("среднюю сумму продаж в месяц в массиве равна" + " " + avgSale);
        System.out.println("номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*" + " " + maxSale);
        System.out.println("номер месяца, в котором был пик продаж, то есть осуществлены продажи на минимальную сумму*" + " " + minSale);
        System.out.println("количество месяцев, в которых продажи были ниже среднего равна" + " " + bellowAverage);
        System.out.println("количество месяцев, в которых продажи были выше среднего равна" + " " + abboveAverage);
        System.out.println(summa.length);
    }
}