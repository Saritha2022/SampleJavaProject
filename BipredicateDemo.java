package java8Demo.POJO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BipredicateDemo {
    static List<Person> personList=PersonRepository.getAllPersons();
    public static void main(String[] args) {

        List empLengthList = findEmpLength(personList,(Person,Integer)->Person.length()==4);
        List empLengthList11 = findEmpWithAnLength4(personList,(Person,Integer)->Person.startsWith("J") && Person.length()==4);
        Iterator iPersonLi = empLengthList.iterator();
        while (iPersonLi.hasNext()) {
            System.out.println(iPersonLi.next());
        }
        System.out.println("*********Records with 2nd condition**********");
        Iterator iPerList=empLengthList11.iterator();
        while (iPerList.hasNext()){
            System.out.println(iPerList.next());
        }

    }
    public static List<Person> findEmpLength(List<Person> per, BiPredicate<String,Integer> biPredicate)
    {
        return per.stream()
                .filter(x->biPredicate.test(x.getName(),x.getName().length())).collect(Collectors.toList());
    }
    public static List<Person> findEmpWithAnLength4(List<Person> per, BiPredicate<String,Integer> biPredicate)
    {
        return per.stream()
                .filter(x->biPredicate.test(x.getName(),x.getName().length())).collect(Collectors.toList());
    }
}
