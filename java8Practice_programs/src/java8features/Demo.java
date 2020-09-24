package java8features;
interface iface{
	public void sum(int a,int b);
}
public class Demo {
	public static void main(String[] args) {
		iface i=(a,b)->System.out.println("the sum:"+(a+b));
		i.sum(20,30);
	}
		

}
