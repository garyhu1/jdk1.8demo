package static_proxy;

public class RealSubject implements Subject{
	
	public void doSomething() {
		System.out.println("RealSubject doSomething");
	}
}
