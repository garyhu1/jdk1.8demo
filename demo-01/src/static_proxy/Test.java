package static_proxy;

public class Test {

	public static void main(String[] args) {
		RealSubject real = new RealSubject();
		ProxySubject proxy = new ProxySubject(real);
		
		proxy.doSomething();
		proxy.doOtherthing();
	}
}
