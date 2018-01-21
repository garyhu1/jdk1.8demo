package interface_new;

public interface Foo {

	public void getFoo(String name);
	
	/**
	 * 使用default就可以定义一个默认的方法
	 */
	default public double sqr(int n){
		return Math.sqrt(n);
	}
}
