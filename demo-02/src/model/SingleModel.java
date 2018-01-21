package model;

public class SingleModel {
	
	private SingleModel () {
		System.out.println("��������");
	};
	
	public static final SingleModel getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder{
		private static final SingleModel INSTANCE = new SingleModel();
	}
}
