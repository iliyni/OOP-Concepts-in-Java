public class HourEmployee extends Employee{
	private double hourMoney;
	private double hours;
	
	public HourEmployee(String FullName, int SSN, double hours, double hourMoney) {
		super(FullName, SSN);
		setHours(hours);
		setHourMoney(hourMoney);
	}

	public double earnings() {
		double salary = 0;
		if (getHours() > 40) {
			salary = ((getHours() - 40) * 1.5 * getHourMoney());
		} else {
			salary = getHours() * getHourMoney();
		}	
		return salary;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHourMoney() {
		return hourMoney;
	}
	public void setHourMoney(double hourMoney) {
		this.hourMoney = hourMoney;
	}

	@Override
	public String toString() {
		return "hourMoney=" + hourMoney + ", hours=" + hours + ", getFullName()=" + getFullName()
				+ ", getSSN()=" + getSSN() + "]";
	}
}
