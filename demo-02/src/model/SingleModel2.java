package model;

public class SingleModel2 {
	
	private static SingleModel2 single = new SingleModel2();
	
	private SingleModel2() {
		System.out.println("����ʽ");
	}
	
	public static SingleModel2 getInstance() {
		return single;
	}
}
