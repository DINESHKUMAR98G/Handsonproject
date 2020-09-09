package Java_handson;
import java.util.*;
import java.io.*;
class Wicket{
	private long over;
	private long ball;
	private String wicketType;
	private String playername;
	private String bowlername;
	public Wicket(long over, long ball, String wicketType, String playername, String bowlername) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playername = playername;
		this.bowlername = bowlername;
	}
	public Wicket() {
		super();
	}
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getBowlername() {
		return bowlername;
	}
	public void setBowlername(String bowlername) {
		this.bowlername = bowlername;
	}
	public void displaywicket() {
		System.out.println("over:"+over);
		System.out.println("ball:"+ball);
		System.out.println("over:"+wicketType);
		System.out.println("over:"+playername);
		System.out.println("over:"+bowlername);

	}
	
}
public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of wickets");
		int wicket=sc.nextInt();
		
		for(int i=1;i<=wicket;i++) {
			System.out.println("enter the deails of wicket"+i);
			String details=sc.nextLine();
			String arr[]=details.split(",", 5);
			int rem=0;
			String overs=arr[rem];
			long a=Long.parseLong(overs);
			rem++;
			String balls=arr[rem];
			long b=Long.parseLong(balls);
			rem++;
			String wicketType=arr[rem];
			rem++;
			String playername=arr[rem];
			rem++;
			String bowlername=arr[rem];
			Wicket wk=new Wicket();
			wk.setOver(a);
			wk.setBall(b);
			wk.setWicketType(wicketType);
			wk.setPlayername(playername);
			wk.setBowlername(bowlername);
			wk.displaywicket();
		}
	}

}
