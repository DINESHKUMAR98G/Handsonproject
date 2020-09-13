package exceptions;
import java.io.IOException;
import java.util.*;
public class Main1 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any ten values");
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println("enter the divisor");
			int div=sc.nextInt();
			for(int j=0;j<arr.length;j++) {
				if(arr[i]%div==0) {
					try {
						throw new ArithmeticException();
					}
					catch(ArithmeticException ae) {
						System.out.println("invalid:"+arr[i]+"invalid with"+div);
					}
				}
				int res=arr[i]%div;
				System.out.println("enter the result:"+res);
			}
		}
	}

}
