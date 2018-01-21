package lambda_new;

@FunctionalInterface
public interface Converter<F,T> {

	T convert (F from);
}
