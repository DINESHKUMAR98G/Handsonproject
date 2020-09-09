package Java_handson;
import java.util.*;
class Delivery{
	public Long over;
	public Long ball;
	public Long runs;
	public String batsman;
	public String bowler;
	public String nonstriker;
	
	public Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonstriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
	}

	void displayDeliveryDetails() {
		System.out.println("delivery details");
		System.out.println("over:"+over);
		System.out.println("ball"+ball);
		System.out.println("runs:"+runs);
		System.out.println("batsman:"+batsman);
		System.out.println("bowler:"+bowler);
		System.out.println("nonstriker:"+nonstriker);
	
	}
}

public class Assignmen3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the over");
		Long over=sc.nextLong();
		System.out.println("enter the balls");
		Long balls=sc.nextLong();
		System.out.println("enter the runs");
		Long runs=sc.nextLong();
		System.out.println("enter the batsman");
		String batsman=sc.next();
		System.out.println("enter the bowler");
		String bowler=sc.next();
		System.out.println("enter the nonstriker");
		String nonstriker=sc.next();
		Delivery1 dl=new Delivery1(over,balls,runs,batsman,bowler,nonstriker);
		dl.displayDeliveryDetails();
		
		
		
		
		
		
		
	}

}
