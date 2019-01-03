package array;

public class PrimeChecker {
    public static void main(String args[]){
        checkPrime(2);
        checkPrime(2,3);
        checkPrime(2,3,4);
        checkPrime(2,3,4,5);
    }
    public static void checkPrime(int ...numbers){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>1){
                if(numbers[i]==2 || numbers[i]==3 || (numbers[i]%2!=0 && numbers[i]%3!=0)){
                    System.out.print(numbers[i]+" ");
                }

            }
        }
        System.out.println();
    }
}
