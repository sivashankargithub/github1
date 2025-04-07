package pkg2;
import java.util.Scanner;
import java.util.ArrayList;
public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1=sc1.nextLine();
		String[] a1=s1.split("");
		ArrayList<String> al1=new ArrayList<>();
		for (int i =0;i<a1.length;i++) {
			al1.add(a1[i]);
			
		}
		System.out.println(al1);
		for(int i=0;i<a1.length;i++) {
			
		}
		al1.add(a1[0]+a1[1]);
		al1.add(a1[2]+a1[3]);
		al1.add(a1[4]+a1[0]);
		System.out.println(al1);
	}

}
