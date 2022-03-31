package java8Demo.POJO;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class HobbyCricketFemale {
    static Consumer<Person> consumerName = (per) -> System.out.println(per);
    static BiConsumer<String, List<String>> hobbyGender = (Name, hobby) -> System.out.println("FemaleName  " + Name + "   Hobby" + hobby);
    static List<Person> list1 = PersonRepository.getAllPersons();

    public static void main(String[] args) {
        System.out.println("Records with Female & Hobby cricket");
        chkHobby();
        System.out.println("Specified columns");
        chkHobbywithGender();

    }

    static void chkHobby() {
        list1.forEach(per -> {
            if (per.getGender().equals("Female") && per.getHobbies().contains("Cricket")) {
                consumerName.accept(per);
            }
        });
    }

    static void chkHobbywithGender() {
        list1.forEach(per -> {
            if (per.getGender().equals("Female") && per.getHobbies().contains("Cricket")) {
                hobbyGender.accept(per.getName(), per.getHobbies());
            }
        });

    }
}
