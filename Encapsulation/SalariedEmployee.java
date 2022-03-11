public class SalariedEmployee extends Employee{
	private double salary;

	public SalariedEmployee(String FullName, int SSN, double salary) {
		super(FullName, SSN);
		setSalary(salary);
	    //this.salary=salary;
	}
	@Override
	public double earnings() {
		return getSalary();
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}
}
