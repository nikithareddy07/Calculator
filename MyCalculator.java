package myStatics;

public class Calculator {

	public static int counter=0;
	public int counterInstance=0;

	

	public void setCounterInstance()
	{
		counterInstance++;
	}
	public static void setCounter() {
		// TODO Auto-generated method stub
		counter++;
	}
	
	public void printAdd(int a, int b) {
		System.out.println("Addition= "+(a+b));
	}
	public static void printMul(int a, int b) {
		System.out.println("Multiplication= "+(a*b));
	}
}
