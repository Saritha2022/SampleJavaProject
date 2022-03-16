package DemoPack;

import java.util.Locale;

public class DemoTerenaryOpe {
    public static void main(String args[]){
        int i1 = 4;
        int i2=15;
         int res;
         String citizen="INDIAN";
        System.out.println("My first program");
                     res = (i1<i2)?(i1+i2):(i1*i2);
        System.out.println("Result  "+res);
       String str=citizen.toLowerCase();
       System.out.println(str);
        String result=(str.equals("indian"))?("Yes Indian"):("Sorry No ");
        System.out.println(result);
    }
 }

