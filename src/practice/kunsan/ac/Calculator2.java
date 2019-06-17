package practice.kunsan.ac;

public class Calculator2 {
	public static <T extends Number> double add(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}
	
	public static <T extends Number> double substract(T a, T b) {
		return a.doubleValue() - b.doubleValue();
	}
	
	public static <T extends Number> double multiply(T a, T b) {
		return a.doubleValue() * b.doubleValue();
	}
	
	public static <T extends Number> double divide(T a, T b) {
		return a.doubleValue() / b.doubleValue();
	}
}
