package lambda_new;

public class Person {

	private String firstName;
	private String lastName;
	
	public Person(){}
	
	public Person(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName(){
		return this.firstName+"."+this.lastName;
	}
}
