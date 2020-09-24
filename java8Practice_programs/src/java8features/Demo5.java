package java8features;
interface interf{
	public void m1();
}
public class Demo5 {
	int x=555;
	public void m2(){
		interf i=()->{
			int x=666;
			System.out.println(x);
			System.out.println(this.x);
			
		};
		i.m1();
		
	}
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		d.m2();
	}
	

}
