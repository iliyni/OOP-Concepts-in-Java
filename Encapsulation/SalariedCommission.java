public class SalariedCommission extends Employee{
	private double baseSalary;
	private int sales;

	public SalariedCommission(String FullName, int SSN, double baseSalary, int sales) {
		super(FullName, SSN);
		setBaseSalary(baseSalary);
		setSales(sales);
	}
	@Override
	public double earnings() {
		double salary = 0;
		salary += getBaseSalary() + getSales() * 0.10;
		return salary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
}
