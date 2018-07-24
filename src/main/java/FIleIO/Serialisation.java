package FIleIO;

import java.io.*;

public class Serialisation {

    public static void main(String args[]){
        try{
            Student st = new  Student("Shriganesh");
            FileOutputStream fos =  new FileOutputStream("file.txt");
            ObjectOutputStream ob = new ObjectOutputStream(fos);
            ob.writeObject(st);
            ob.close();
            fos.close();
            System.out.println("Serialized Object Successfully");
            FileInputStream fis =  new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student st1 = (Student)(ois.readObject());
            System.out.println(st1.name);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}



class Student implements Serializable{
    String name;
    Student(String name){
      this.name =  name;
    }
}
