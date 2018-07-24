package test;

import java.util.Comparator;
import java.util.TreeSet;

public class Test5 {
    public static void main(String args[]){
        TreeSet<Student1> t = new TreeSet<Student1>();
        t.add(new Student1("sdsd", 4));
        t.add(new Student1("sdswd", 5));
        for(Student1 st:t){
            System.out.println("Name: " + st.name + " Age: " + st.age);
        }
    }


}

class Student1 implements Comparable{
    String name;
    int age;
    public Student1(String name, int age){
        this.name = name;
        this.age =  age;
    }
    public int compareTo(Object obj1){
        Student1 st1 = (Student1)obj1;

        if(age > st1.age){
            return 1;
        }else if(age == st1.age){
            return 0;
        }else if(age < st1.age){
            return -1;
        }
        return 0;
    }
}

