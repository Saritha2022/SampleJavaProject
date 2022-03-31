package java8Demo.POJO;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class PersonWithAn2Kids {

    static Consumer<Person> c11 = (per) -> System.out.println(per);
    static BiConsumer<String,Integer> nameKids=(name,kids)-> System.out.println("Name  "+name+"   Kids="+kids);
    static List<Person> peopleList=PersonRepository.getAllPersons();
    public static void main(String[] args) {
        System.out.println("Records with A and 2 kids");
                printWithCondition();
                printWithCondition1();
    }

    static void printWithCondition(){
        peopleList.forEach(per1 ->{
            if(per1.getName().startsWith("A") && per1.getKids()==2) {
                c11.accept(per1);
            }
        });

    }
    static void printWithCondition1(){
        peopleList.forEach(per ->{
            if(per.getName().startsWith("A") && per.getKids()==2) {
                nameKids.accept(per.getName(), per.getKids());
            }
        });

    }

}
