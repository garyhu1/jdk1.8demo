package move_proxy;

import java.lang.reflect.Proxy;

public class TestProxy {

	public static void main(String[] args) {
		UserDAO ud = new UserDAOImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.query();
		System.out.println("----------------------");
		
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		
		UserDAO proxy = (UserDAO)Proxy.newProxyInstance(ud.getClass().getClassLoader(),
				ud.getClass().getInterfaces(), handler);
		
		proxy.add();
		proxy.update();
		proxy.delete();
		proxy.query();
	}
}
