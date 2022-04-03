package java8Demo.POJO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicatePerson {
    static List<Person> personList=PersonRepository.getAllPersons();
        public static void main(String[] args) {

            List maleEmployee = findMaleEmployee(personList, (Person p) -> p.getGender().contains("Male")&&(p.getHeight()>=140));
             Iterator iPersonLi = maleEmployee.iterator();
            while (iPersonLi.hasNext()) {
                System.out.println(iPersonLi.next());
            }

        }
public static List<Person> findMaleEmployee(List<Person> per, Predicate<Person> conTestPerson)
{
    List<Person> res=new ArrayList<>();
    for(Person p:per)
        if(conTestPerson.test(p))
            res.add(p);
    return res;
}
}
