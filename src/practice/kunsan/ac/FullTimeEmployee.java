package practice.kunsan.ac;

public class FullTimeEmployee extends Employee {
	
	private int annualSalary;

	public FullTimeEmployee(String name, int annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
	}

	public FullTimeEmployee(String name, String email, int annualSalary) {
		super(name, email);
		this.annualSalary = annualSalary;
	}
	
	public int getAnnualSalary() {
		return this.annualSalary;
	}
	
	public void AdjustSalary(int amount) {
		this.annualSalary += amount;
	}
}
