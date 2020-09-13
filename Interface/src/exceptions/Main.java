package exceptions;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter any ten values");
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		try {
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j>=0;j++) {
			int res=(arr[j]/arr1[j]);
			System.out.println("result of arrray"+res);
		}
	}
	catch(ArrayIndexOutOfBoundsException aoe) {
		System.out.println("elements finish");
	}
	}

}
