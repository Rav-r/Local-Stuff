import java.util.*;
import java.util.function.*;
public class func1 {
  public static void main(String args[]){
    List<Person> people = List.of(
        new Person("Dominic" , Gender.MALE),
        new Person("Lucy" , Gender.FEMALE),
        new Person("Tony" , Gender.MALE),
        new Person("Sophie" , Gender.FEMALE),                                       
        new Person("Zac" , Gender.MALE));                                       

    Predicate<Person> a = person -> Gender.FEMALE.equals(person.gender);
    people.stream()
      //.filter(person -> Gender.FEMALE.equals(person.gender))
      .filter(a)
      .forEach(System.out::println);



  };
  static class Person{
    private final String name;
    private final Gender gender;
    Person(String name, Gender gender){
      this.name = name; 
      this.gender = gender;
    }
    @Override
    public  String toString(){
      return "Peoples:{Name: '"+ name + "', Gender: '"+gender+"'}";
    }

  }
  enum Gender{
    MALE,
    FEMALE;
  }

}

