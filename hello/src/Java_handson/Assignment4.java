package Java_handson;
import java.util.*;
class Player1{
	String name;;
	String country;;
	String skill;;
	public Player1(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	void PlayerDetails() {
		System.out.println("player details");
		System.out.println("player name:"+name);
		System.out.println("country name:"+country);
		System.out.println("skill:" +skill);
	}
	
}
public class Assignment4 {

	public static void main(String[] args) {
		System.out.println("enter the player details");
		Scanner sc=new Scanner(System.in);
		
		String details=sc.nextLine();
		String arr[]=details.split(",", 3);
		String name=arr[0];
		String country=arr[1];
		String skill=arr[2];
		Player1 pl=new Player1(name,country,skill);
		pl.PlayerDetails();
		
	}

}
