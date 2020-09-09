package Java_handson;
import java. util.*;
class Player{
	String name;
	String country;
	String skill;
}

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the country");
		String country=sc.nextLine();
		System.out.println("enter the skill");
		String skill=sc.nextLine();
		System.out.println("player details");
		System.out.println("player name:"+name);
		System.out.println("country name:"+country);
		System.out.println("skill:"+skill);
	}

}
