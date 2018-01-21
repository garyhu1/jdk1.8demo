package interface_new;

public class TestInterface {

	public static void main(String[] args) {
		FooImpl f = new FooImpl();
		double value = f.sqr(100);
		f.getFoo("James");
		System.out.println("value : "+value);
		System.out.println("name: "+f.getName());
	}
}
