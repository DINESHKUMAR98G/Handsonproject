package Java_handson;
import java.util.*;
class Delivery1{
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String bowler;
	private String nonstriker;
	public Delivery1(long over, long ball, long runs, String batsman, String bowler, String nonstriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
	}
	public Delivery1() {
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
	
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonstriker() {
		return nonstriker;
	}
	public void setNonstriker(String nonstriker) {
		this.nonstriker = nonstriker;
	}
	void display(){
		System.out.println("over:"+over);
		System.out.println("ball:"+ball);
		System.out.println("runs:"+runs);
		System.out.println("batsman:"+batsman);
		System.out.println("bowler:"+bowler);
		System.out.println("nonstriker:"+nonstriker);
		
		
	}
		
	}
public class Assignment7 {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the over");
		long over=sc.nextLong();
		System.out.println("enter the ball");
		long ball=sc.nextLong();
		System.out.println("enter the runs");
		long runs=sc.nextLong();
		System.out.println("enter the batsman name");
		String batsman=sc.nextLine();
		System.out.println("enter the bowler");
		String bowler=sc.nextLine();
		System.out.println("enter the nonstriker");
		String nonstriker=sc.nextLine();
		Delivery1 dl=new Delivery1();
		dl.setOver(over);
		dl.setBall(ball);
		dl.setRuns(runs);
		dl.setBatsman(batsman);
		dl.setBowler(bowler);
		dl.setNonstriker(nonstriker);
	
		dl.display();
		
	}

}
