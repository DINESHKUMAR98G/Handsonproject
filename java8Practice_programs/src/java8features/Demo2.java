package java8features;
interface iface2{
	public void square(int x);
}
public class Demo2 {
	public static void main(String[] args) {
		iface2 i=x->System.out.println("the sqrt  is:"+(x*x));
		i.square(6);
	}

}
