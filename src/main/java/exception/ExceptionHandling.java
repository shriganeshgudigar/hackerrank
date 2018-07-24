package exception;

public class ExceptionHandling {
	public static void main(String args[]){
		try{
			n();
		}catch(ArithmeticException e){
			System.out.println("Exception message: " + e.getMessage());
			System.out.println("Exception get stacktrace: " );
			e.printStackTrace();
		}
	}
	
	public static void m() throws ArithmeticException{
		try{
			int x = 5/0;
		}catch(Exception e){
			throw new ArithmeticException("throwing arithmetic exception, method: m()");
		}
	}
	
	public static void n() throws ArithmeticException{
		m();
	}
}

class ArithmeticException extends Exception{
	String errorMessage;
	public ArithmeticException(String str){
		super(str);
		errorMessage =  str;
	}
	
	public String getMessage(){
		return errorMessage;
	}
	
}
