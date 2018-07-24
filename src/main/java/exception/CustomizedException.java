package exception;

public class CustomizedException {
	
	public static void main(String args[]){
		try {
			TestCustomException1.invalidateAge();
		} catch (Exception e) {
			
			e.printStackTrace();
			e.getMessage();
		}
	}

}

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}

class TestCustomException1{
	
	public static void  invalidateAge() throws InvalidAgeException{
		throw new InvalidAgeException("InvalidAgeException exception thrown");
	}
}
