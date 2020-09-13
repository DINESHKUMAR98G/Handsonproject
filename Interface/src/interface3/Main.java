package interface3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		Servive s=new Servive();
		System.out.println(":enter car number");
		int choice=sc.nextInt();
		while(a>0) {
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		s.sum(sum);
		System.out.println("how many years car yoy hve");
		c=sc.nextInt();
		System.out.println("car brand");
		String brand=sc.next();
		s.brand(brand);
		
	}

}
