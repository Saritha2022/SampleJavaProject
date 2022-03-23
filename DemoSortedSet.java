package DemoPack;

import java.util.*;

public class DemoSortedSet {
    public static void main(String[] args) {
        SortedSet ss=new TreeSet();
        ss.add(100);
        ss.add(106);
        ss.add(95);
        ss.add(23);
        ss.add(65);
        ss.add(160);
        ss.add(230);
        ss.add(110);
        ss.add(125);
        System.out.println(ss);
        System.out.println("First element  :"+ss.first());
        System.out.println("Last element    :"+ss.last());
        System.out.println("Headset  :"+ss.headSet(106));
        System.out.println("Tailset   :"+ss.tailSet(106));
        System.out.println("SubSet    :"+ss.subSet(100,160));

        System.out.println("************lINKED  HASH SET***************************");
        LinkedHashSet lhs=new LinkedHashSet<>();
        lhs.add("Kalpana");
        lhs.add("Saritha");
        lhs.add("Haranath");
        lhs.add("Rama Mohan Rao");
        lhs.add("Dhana Lakshmi");
        lhs.add("Ramnagar");
        lhs.add("DSNR");
        lhs.add(10);
        lhs.add(5);
        lhs.add(25);
        lhs.add("Ammerpet");
        lhs.add(100);
        lhs.add(95);

        System.out.println(lhs);
        System.out.println("Size of LHS  :"+lhs.size());
        lhs.remove(25);
        System.out.println("after removing 25"+lhs);
        lhs.remove("Rama Mohan Rao");
        System.out.println("after removing Ram"+lhs);

        System.out.println("************HASH SET***********************");
        HashSet hs=new HashSet<>();
        hs.add(21);
        hs.add(16);
        hs.add(400);
        hs.add(120);
        hs.add(210);
        hs.add(90);
        hs.add(110);
        hs.add(165);
        hs.add(0);
        hs.add(135);
        hs.add(16);
        System.out.println(hs);
        System.out.println("Size of the Hash set  :");
        System.out.println(hs.size());
        System.out.println("does the set contain 90");
        System.out.println(hs.contains(90));
        System.out.println("Does the set contain 200");
        System.out.println(hs.contains(200));
        System.out.println(hs);
        hs.remove(90);
        System.out.println("After removing 90 set");
        System.out.println(hs);
    }
}
