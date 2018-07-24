package collection;
import java.util.*;

public class ArrayListt {
	public static void main(String args[]){
		Student st1 = new Student("12", "Shriganesh");
		Student st2 = new Student("13", "Arun");
		Student st3 = new Student("14", "Raghu");
		ArrayList<Student> stud= new ArrayList<Student>();
		stud.add(st1);
		stud.add(st2);
		stud.add(st3);
		Iterator itr = stud.iterator();
		System.out.println(stud.get(0).id);
		while(itr.hasNext()){
			Student st = (Student)itr.next();
			System.out.println("Id: " + st.id + " Name: " + st.name);
		}
		ArrayList ar = new ArrayList();
		ar.add("123");
		ar.add(1, "qwert");
		ar.add(123);
		ar.clear();
		ar.add(0, "Shriganesh");
		ar.add(123.34);
		Iterator it = ar.iterator();
		while(it.hasNext()){
			System.out.println("Data: " + it.next());
		}
	}

	
}	

class Student{
	String name;
	String id;
	Student(String id, String name){
		this.name = name;
		this.id = id;
	}
}
