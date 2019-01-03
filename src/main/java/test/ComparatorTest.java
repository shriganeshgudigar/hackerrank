package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class  ComparatorTest {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Joe", 24),
                new Person("Pete", 18),
                new Person("Chris", 21),
                new Person("Admin", 21)
        );
        Collections.sort(people, new PeopleComparator());
        for(Person ple: people){
            System.out.println("Person: " + ple);
        }
    }
}


class PeopleComparator implements Comparator<Person> {

    //compare age then with name, lhs>rhs return 1.
    public int compare(Person a, Person b) {
       int name  =  a.name.compareTo(b.name);
       int age = a.getAge().compareTo(b.getAge());
       if(age==0){
            return name;
       }else{
           return age ;
       }
    }
}

class NameComparatator implements Comparator<Person>{

    public int compare(Person a, Person b){
        int name =  a.name.compareTo(b.name);
        return name;
    }
}

class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
    Integer getAge(){
        return age;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, age=%d}", name, age);
    }
}
