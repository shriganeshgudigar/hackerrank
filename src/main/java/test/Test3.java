package test;


import java.util.ArrayList;

import java.util.*;

public class Test3{
    public static void main(String args[]){
        Student st1 = new Student(12, "Shriganesh");
        Student st2 = new Student(22, "Ganesh");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        Collections.sort(list, new NameComparator());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student st = (Student)(itr.next());
            System.out.println("Name: " + st.name + " RollNo: " + st.rollNo);
        }
    }
}

interface T1<T>{

}

class Student{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student>{
    public int compare(Student obj1, Student obj2){
        return obj1.name.toString().compareTo(obj2.name.toString());
    }
}
