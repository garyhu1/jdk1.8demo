package static_proxy;

public class ProxySubject implements Subject {
	
	private Subject real;
	
	public ProxySubject(Subject real) {
		this.real = real;
	}

	public void doSomething() {
		System.out.println("ProxySubject before real doSomething");
		real.doSomething();
        System.out.println("ProxySubject end real doSomething");
	}
	
	public void doOtherthing() {
		System.out.println("ProxySubject doOtherthing");
	}

}
