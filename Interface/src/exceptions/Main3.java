package exceptions;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any ten values");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter divisor");
		int divisor=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			try {
				if(arr[i]%2==0&&divisor%2==1||arr[i]%2==1&&divisor%2==0) {
					throw new IllegalArgumentException();
				}
			}
			catch(IllegalArgumentException iae) {
				System.out.println("exception handled");
			}
			int res=arr[i]/divisor;
			System.out.println(res);
		}
	}

}
