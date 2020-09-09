package Java_handson;
import java.util.*;
class ExtraType{
	String name;
	long runs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	
}
public class Assignment6 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the extratype details");
		String details=sc.nextLine();
		String arr[]=details.split("#",2);

		System.out.println("enter the details");
		String name=arr[0];
		String runs=arr[1];
		long run=Long.parseLong(runs);


		ExtraType ex=new ExtraType();
		ex.setName(name);
		
		ex.setRuns(run);
		System.out.println("Extratype:"+name);
		System.out.println("Runs:"+runs);
		

	}

}
