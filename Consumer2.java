package java8Demo.POJO;

import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {
    static Consumer<Person> consumerName=(person -> System.out.println(person));
    static List<Person> personList=PersonRepository.getAllPersons();
    static Consumer<Person> consumerHobby=(person -> System.out.println(person));

    public static void main(String[] args) {
        System.out.println("*****Starts with A *******");
        dotheSortingCondition();
        System.out.println("*********Records with Hobby Cricket***************");
        getHobbies();
    }
    static void dotheSortingCondition(){
        personList.forEach(per1->{
            if(per1.getName().startsWith("A"))
                consumerName.accept(per1);
        });
         }
         static void getHobbies(){
        personList.forEach((per2->{
            if(per2.getHobbies().contains("Cricket"))
            {
                consumerHobby.accept(per2);
            }
        }));
         }
}
