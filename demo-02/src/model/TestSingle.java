package model;

public class TestSingle {

	public static void main(String[] args) {
		SingleModel2 single1 = SingleModel2.getInstance();
		
		SingleModel2 single2 = SingleModel2.getInstance();
		
		SingleModel2 single3 = SingleModel2.getInstance();
		
		SingleModel2 single4 = SingleModel2.getInstance();
	}
	
}
