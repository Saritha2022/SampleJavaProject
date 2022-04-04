package java8Demo.POJO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class StreamsDemoChkEven {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10, 50, 25, 60, 98, 76, 24, 77, 55, 123,121,100,50,1, 5,10, 9, 8, 11, 15);
        System.out.println("Odd numbers in the arrayList");
        List<Integer> result=numList.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
        System.out.println(result);
        System.out.println("Even Numbers Stream");
        numList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
