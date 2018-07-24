package advancedJava;

public class interfaceImplimentation{
    public static void main(String args[]){
        Mammal mammalIns = new Mammal();
        mammalIns.eat();
        mammalIns.age();
    }
}

 interface  Animal{
         public void eat();
         public void age();
}

class Mammal implements Animal {
    public void eat(){
        System.out.println("Printing eat");
    }
    public void age(){
        System.out.println("Printing age");
    }
}
