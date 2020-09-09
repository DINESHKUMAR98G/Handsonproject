package inheritance3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Stall st=new Stall();
		Scanner sc=new Scanner(System.in);
		String name;
		String detail;
		String ownername;
		int squarefeet;
		int noOftv;
		System.out.println("enter the name of stall");
		name=sc.nextLine();
		System.out.println("enter the details of stall");
		detail=sc.nextLine();
		System.out.println("enter the ownername of the stall");
		ownername=sc.nextLine();
		System.out.println("enter the type of the stall");
		int type=sc.nextInt();
		System.out.println("enter the size of the stall in square feet");
		squarefeet=sc.nextInt();
		System.out.println("does the hall have tv");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter the no of tv");
			noOftv=sc.nextInt();
			st.computecost(squarefeet,noOftv);
			
		}
		else {
			st.computecost(type,squarefeet);
		}
		

	}

}
