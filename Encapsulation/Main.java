public class Main {
	public static void main(String[] args) {

		System.out.println("Salaried Employees:");
		Employee e1 = new SalariedEmployee("name1", 123, 8000);
		System.out.println("Name: "+e1.getFullName()+ ", SSN: "+ e1.getSSN()+", Salary: "+e1.earnings());

		System.out.println("\nHour Employees:");
		Employee e2 = new HourEmployee("name2", 1234, 50, 100);
		System.out.println("Name: "+e2.getFullName()+ ", SSN: "+ e2.getSSN()+", Salary: "+e2.earnings());

		System.out.println("\nCommission Employees:");
		Employee e3 = new CommissionEmployee("name3", 12345, 0.20, 2000);
		System.out.println("Name: "+e3.getFullName()+ ", SSN: "+ e3.getSSN()+", Salary: "+e3.earnings());

		System.out.println("\nSalaried Commission Employees:");
		Employee e4 = new SalariedCommission("name4", 123456, 3000, 1500);
		System.out.println("Name: "+e4.getFullName()+ ", SSN: "+ e4.getSSN()+", Salary: "+e4.earnings());
	}
}
