package collection;

import java.util.*;


class Stud{
    int rollNo;
    String name;
    int age;
    Stud(int rollNo, String name, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Stud>{
    public int compare(Stud st1, Stud st2){
        if(st1.age == st2.age){
            return 0;
        }else if(st1.age > st2.age){
            return 1;
        }else
            return -1;
    }
}

class NameComparator implements Comparator<Stud>{
    public int compare(Stud st1, Stud st2){
        return st1.name.compareTo(st2.name);
    }
}

class Employee implements Comparable<Employee>{
    int rollNo;
    String name;
    int age;
    Employee(int rollNo, String name, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int compareTo(Employee employee){
        return this.name.compareTo(employee.name);
    }
}
public class ComparatorCall{
    public static void main(String args[]){
        ArrayList<Stud> list = new ArrayList<Stud>();
        list.add(new Stud(23, "Shriganesh", 22));
        list.add(new Stud(24, "Vishwa", 26));
        list.add(new Stud(25, "Raghunandana", 29));
        list.add(new Stud(29, "Sachin", 28));

        Collections.sort(list, new AgeComparator());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Stud st = (Stud)itr.next();
            System.out.println(st.name + " " + st.rollNo + " " + st.age);
        }
        System.out.println("\n\n");
        Collections.sort(list, new NameComparator());
        Iterator itrName = list.iterator();
        while(itrName.hasNext()){
            Stud st = (Stud)itrName.next();
            System.out.println(st.name + " " + st.rollNo + " " + st.age);
        }
        System.out.println("\n\n");

        TreeSet<Employee> treeSet = new TreeSet<Employee>();
        treeSet.add(new Employee(23, "Shriganesh", 22));
        treeSet.add(new Employee(24, "Vishwa", 26));
        treeSet.add(new Employee(25, "Raghunandana", 29));
        treeSet.add(new Employee(29, "Sachin", 28));

        Iterator empItr = treeSet.iterator();
        while(empItr.hasNext()){
            Employee st = (Employee)empItr.next();
            System.out.println(st.name + " " + st.rollNo + " " + st.age);
        }
    }
}


