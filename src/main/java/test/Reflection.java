package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String args[]){
        ReflectionDemo d = new ReflectionDemo();
        d.method();
    }
}

class ReflectionDemo{
    public void method(){
        try {
            Reflect1 obj = new Reflect1();
            Method c = Class.forName("Reflect1").getMethod("getMethod1", new Class[]{int.class});
            c.invoke(obj, "arg");
        }catch(ClassNotFoundException ex){
            System.out.println("ja");
            System.out.println(ex.getStackTrace());
        }catch(NoSuchMethodException ex){
            System.out.println(ex.getMessage());
        }catch(IllegalAccessException ex){
            System.out.println(ex.getMessage());
        }catch(InvocationTargetException ex){
            System.out.println(ex.getMessage());
        }
    }
    class Reflect1{
        public void getMethod1(String param){
            System.out.println("getMethod1 " + param);
        }

        public void getMethod2(String param){
            System.out.println("getMethod2 " + param);
        }
    }
}


