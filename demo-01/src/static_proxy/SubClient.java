package static_proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.rmi.CORBA.Stub;

public class SubClient {
	public static void main(String[] args) throws Exception {
		SubClient client =  new SubClient();
		//(2)ͨ��Ϊ Proxy ��ָ�� ClassLoader �����һ�� interface ��������̬������
        Class<?> proxyClass = Proxy.getProxyClass(Stub.class.getClassLoader(), new Class<?>[]{Subject.class});
        //(3)ͨ��������ƻ�ö�̬������Ĺ��캯������Ψһ���������ǵ��ô������ӿ�����
        Constructor<?> proxyClassConstructor = proxyClass.getConstructor(new Class<?>[]{InvocationHandler.class});
        //(4)ͨ�����캯��������̬������ʵ��������ʱ���ô�����������Ϊ����������
        Object o = proxyClassConstructor.newInstance(client.handler);
        //(5)ͨ����̬����������
        Subject subject = (Subject) o;
        //(6)���ί����Ľ��
        subject.doSomething();
	}
	
	//(1)ͨ��ʵ�� InvocationHandler �ӿڴ����Լ��ĵ��ô�����
    private InvocationHandler handler = new InvocationHandler() {
        //����ί�������ʵ��
        private RealSubject real = new RealSubject();

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //����ί����ķ���
            return method.invoke(real, args);
        }
    };
}
