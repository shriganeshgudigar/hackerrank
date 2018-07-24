package amazon;

public class Power{
    public static void main(String args[]){
        int value = power(10,1);
        System.out.println("Value: " + value);
    }

    public static int power(int x, int y){
        int value = 0;
        if(y==1){
            return x;
        }
        if(y==0){
            return 1;
        }
        if(y%2==0){
            value = power(x, y/2)*power(x, y/2);
        }else{
            value = x*power(x, y/2)*power(x,y/2);
        }
        return value;
    }
}


