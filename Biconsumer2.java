package java8Demo.POJO;

import java.util.List;
import java.util.function.BiConsumer;

public class Biconsumer2 {
    static List<Person> personList1 = PersonRepository.getAllPersons();
    static BiConsumer<String, Integer> heights=(pname,pheight)->
            System.out.println("Name is    :"+pname+"  "+"Height of the Person  :"+pheight);

    public static void main(String[] args) {
        fetchHeight();
    }
    static void fetchHeight(){
        personList1.forEach(phgt->{
            heights.accept(phgt.getName(),phgt.getHeight());
        });
        }
}
