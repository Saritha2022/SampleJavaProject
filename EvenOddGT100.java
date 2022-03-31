package java8Demo.POJO;

import java.util.function.Predicate;

public class EvenOddGT100 {
    public static void main(String[] args) {
        Predicate<Integer> oddInt = (odd -> odd % 2 == 1);
        Predicate<Integer> evenInt = (even -> even % 2 == 0);
        Predicate<Integer> greaterThan100 = (gt -> gt > 100);
        System.out.println(oddInt.test(60));
        System.out.println(evenInt.test(300));
        System.out.println("Greater tha 100" + greaterThan100.test(500));

    }
}
