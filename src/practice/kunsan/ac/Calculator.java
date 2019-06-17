package practice.kunsan.ac;

public class Calculator<T extends Number> {
	public Calculator() {

	}

	public double sum(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}

	public double substract(T a, T b) {
		return a.doubleValue() - b.doubleValue();
	}

	public double multiply(T a, T b) {
		return a.doubleValue() * b.doubleValue();
	}

	public double divide(T a, T b) {
		return a.doubleValue() / b.doubleValue();
	}
}