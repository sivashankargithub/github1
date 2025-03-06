
package pkg1;

public class Fact1 {
	public static int findFactorial(int num){
		int fact1=1;
		
		for(int i=1;i<num+1;i++) {
			fact1=fact1*i;
		}
		return fact1;
	}

	public static void main(String[] args) {
		int num1 = 5;
		int factorial=findFactorial(num1);
		System.out.println("Factorial of "+num1+" is "+factorial);

	}

}
