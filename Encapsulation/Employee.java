public abstract class Employee {
	private String FullName;
	private int SSN;
	
	public Employee(String FullName, int SSN){
		setFullName(FullName);
		setSSN(SSN);
	}
	
	public abstract double earnings();
	
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String FullName) {
		this.FullName = FullName;
	}
	
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int SSN) {
		this.SSN = SSN;
	}

	@Override
	public String toString() {
		return FullName + ", SSN=" + SSN ;
	}
	
}
