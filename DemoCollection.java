package DemoPack;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(0,25);
        al.add(1,"Saritha");
        al.add(2,50);
        al.add(3,"Happy");
        al.add(4,75);
        al.add(100);
        System.out.println(al);
        /*Iterator it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
            ArrayList al1=new ArrayList();
            al1.add(120);
            al1.add(250);
            al1.add(300);
            al1.add("HTML");
            al1.add("JDBC");
            al1.add("Servlets");
            al1.add("System settings");
            al.addAll(al1);//addAll Method used.
        System.out.println(al);
          /*  Iterator it1=al.iterator();
            while (it1.hasNext()) {
                System.out.println(it1.next());
            }*/
        System.out.println(al);
                al.remove("Happy");
                System.out.println("After removing Happy"+al);
                al.remove(2);
        System.out.println(al);
                System.out.println(al.size());
                System.out.println(al.contains("JDBC"));
                System.out.println(al.get(1));
        System.out.println(al.hashCode());
        System.out.println(al.subList(3,7));
        al.set(8,"Replace");
        System.out.println(al);
        System.out.println("*******************LINKED LIST**************************");
     LinkedList LL=new LinkedList<>();
        LL.add("Idly");
        LL.add("DOSA");
        LL.add(500);
        LL.add(600);
        LL.add("POORI");
        System.out.println(LL);
        LL.addFirst("First");//adding first a value
        System.out.println(LL);
        LL.addLast(al);//adding last an obj
        System.out.println(LL);
        LL.remove(al);
        System.out.println(LL);
   }
}

