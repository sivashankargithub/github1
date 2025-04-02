
package pkg1;

import java.util.ArrayList;
import java.util.List;

public class Fact1 {
	public static List<Integer> factorialNum(int num){
		List<Integer> list1=new ArrayList<>();
		for(int i=1;i<num+1;i++) {
			int fact1=findFactorial(i);
			list1.add(fact1);
		}
		return list1;
	}
	public static int findFactorial(int num){
		int fact1=1;
		
		for(int i=1;i<num+1;i++) {
			fact1=fact1*i;
		}
		return fact1;
	}

	public static void main(String[] args) {
		int num1 = 5;
	
		for(int i=1;i<num1+1;i++) {
			System.out.println("Factorial of "+i+" is "+factorialNum(num1).get(i));
		}
		

	}

}
