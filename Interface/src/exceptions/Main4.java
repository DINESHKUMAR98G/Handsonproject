package exceptions;
import java.util.*;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter divisor");
		int divisor=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				try {
					throw new ArithmeticException();
				}
				catch(ArithmeticException ae) {
					System.out.println("invalid operation:"+arr[i]+" "+divisor);
				}
			}
			int res=arr[i]%divisor;
			System.out.println("res:"+res);
		}
	}

}
