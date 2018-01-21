package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) {
		Student s = new Student();
		
		//获取类注解
		MyBind mb = s.getClass().getAnnotation(MyBind.class);
		
		System.out.println("name: "+mb.name()+", ID: "+mb.ID());
		
		//获取属性注解
		Field[] fields = s.getClass().getDeclaredFields();
		for(Field f : fields){
			MyField mf = f.getAnnotation(MyField.class);
			if(mf!=null){
				System.out.println("value: "+mf.value()+", type: "+mf.type());
			}
		}
		
		Method[] methods = s.getClass().getDeclaredMethods();
		for(Method m : methods){
			MyMethod mm = m.getAnnotation(MyMethod.class);
			if(mm!=null){
				System.out.println("method: "+mm.method()+", name : "+mm.name());
			}
		}
		
	}
}
