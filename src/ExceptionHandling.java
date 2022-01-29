
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numb = 10;
		int [] arry = {30,5,200,78};
		try {
			int result = numb/0;
			System.out.println(arry[100]);
		}catch(ArithmeticException e) {
			System.out.println("inside  ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("inside  ArithmeticException");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		System.out.println("after try and catch");

	}

}
