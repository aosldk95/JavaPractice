package practice.kunsan.ac;

public class PartTimeEmployee extends Employee {

	private int hourlyRate;
	
	public PartTimeEmployee(String name, int hourlyRate) {
		super(name);
		this.hourlyRate = hourlyRate;
	}
	
	public PartTimeEmployee(String name, String email, int hourlyRate) {
		super(name, email);
		this.hourlyRate = hourlyRate;
	}

	public int calculatePay(int time) {
		return hourlyRate * time;
	}
}
