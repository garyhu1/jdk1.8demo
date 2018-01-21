package interface_new;

/**
 * 实现了Foo接口，只需要实现抽象的方法，
 * @author garyhu
 *
 */
public class FooImpl implements Foo {
	
	private String name;

	@Override
	public void getFoo(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
