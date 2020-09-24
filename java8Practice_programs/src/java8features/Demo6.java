package java8features;
interface left{
	default void m1() {
		System.out.println("left default method");
	}
}
interface right{
	default void m2() {
		System.out.println("right default method");
	}
}
public class Demo6 implements left,right {
	/*public void m1() {
		System.out.println("test class methods");OR left.m1();
	}*/
	public void m1() {
		/* System.out.println("Test Class Method"); */ left.super.m1();
	Demo6 dt=new Demo6();
	dt.m1();
	}
	}
