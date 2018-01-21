package lambda_new;

/**
 * 使用@FunctionInterface来声明这是一个函数式接口，
 * 接口的抽象方法只能有一个，且不能没有，
 * 新特性的lambda可以识别这种接口(注：没有@FunctionInterface时，只要满足一个抽象方法就可以，含有默认方法也可)
 * @author garyhu
 *
 */
@FunctionalInterface
public interface MyInterface {

	String getMyName(String name);
	
	default void say(){
		System.out.println("Hello World!");
	}
}
