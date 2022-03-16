package DemoPack;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String str = "I love India";
        String str1 = "I am Saritha";
        String[] str3={"Hello","Friend","love","Life"};
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(str.getBytes());
        System.out.println(str.concat(str1));
        System.out.println(str.charAt(8));
        System.out.println(str1.contains("z"));
        System.out.println(str.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str.indexOf('l'));
        System.out.println(str1.indexOf("Saritha"));
        System.out.println(str1.indexOf(1));
        System.out.println(arr.length);
        System.out.println(arr[2]);
        for (int prt : arr) {
            System.out.println(prt);
        }
        for(String ss:str3){
            System.out.println(ss);
        }
    }
}
