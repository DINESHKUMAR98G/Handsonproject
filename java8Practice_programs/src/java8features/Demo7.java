package java8features;
interface inter{
	public static void sum(int a,int b) {
		System.out.println("the sum is:"+(a+b));
	}
}
public class Demo7 {
	public static void main(String[] args) {
		inter.sum(10,20);
	}
}
