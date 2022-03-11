public class CommissionEmployee extends Employee{
	private double percentage;
	private int sales;

	public CommissionEmployee(String FullName, int SSN, double percentage, int sales) {
		super(FullName, SSN);
		setPercentage(percentage);
		setSales(sales);
	}
	public double earnings() {
		double salary = 0;
		salary += getSales() * getPercentage();
		return salary;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
}
