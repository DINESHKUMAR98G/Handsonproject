package Java_handson;
import java.util.*;
class venue{
	String name;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class Assignment5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the venue name");
		String name=sc.nextLine();
		System.out.println("enter the city");
		String city=sc.nextLine();
		
	}

}
