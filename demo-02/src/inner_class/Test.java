package inner_class;

class Human {
	
	private Cup cup;
	private String name;
	
    public Human(String name) {
		this.cup = new Cup();
		this.name = name;
	}
	
	class Cup {
		private double water = 1.0;
		
		public double getWater() {
			return this.water;
		}
		
		public void useCup(double w) {
			this.water = this.water-w;
		}
	}
	
	public void drinkWater(double w) {
		cup.useCup(w);
		System.out.println(cup.getWater());
	}
	
}

public class Test{
	public static void main(String[] args) {
		Human man = new Human("xiaoming");
		man.drinkWater(0.3);
		Human.Cup myCup = man.new Cup();
	}
}
