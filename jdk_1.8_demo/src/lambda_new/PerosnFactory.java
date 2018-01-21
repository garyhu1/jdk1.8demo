package lambda_new;

public interface PerosnFactory<P extends Person> {
	
	P create(String firstName,String lastName);

}
