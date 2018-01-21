package lambda_new;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names,(a,b) -> b.compareTo(a));
		for(String v: names){
			System.out.println(v);
		}
		
		MyInterface in = name -> "帅气"+name;
		
		String s = in.getMyName("Judy");
		System.out.println(s);
		
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);
		
		String str = "Java";
		Converter<String, Boolean> con = str::startsWith;
		Boolean conve = con.convert("J");
		System.out.println(conve);  
		
//		我们只需要使用 Person::new 来获取Person类构造函数的引用，
//		Java编译器会自动根据PersonFactory.create方法的签名来选择合适的构造函数。
		PerosnFactory<Person> factory = Person::new;
		Person p = factory.create("LB","James");
		System.out.println(p.getName());
		
		//访问外层的局部变量的测试(可以不用final修饰，)
		//不过这里的num必须不可被后面的代码修改（即隐性的具有final的语义）,修改后就编译不通过
		int num = 1;
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);
		String val = stringConverter.convert(2);     // 3
		System.out.println(val);
		
		//lambda表达式无法访问接口中的默认方法
//		MyInterface m = () -> say();
		
	}
	
}
