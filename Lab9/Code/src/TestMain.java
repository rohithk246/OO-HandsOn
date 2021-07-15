public class TestMain {
	public static void main(String[] args) {
		
		// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee("emp1", "Michael", 50000, new Roles(3));
		Employee emp2 = new Employee("emp2", "Jim", 25000, new Roles(1));
		Employee emp3 = new Employee("emp3", "Pam", 15000, new Roles(4));
		Employee emp4 = new Employee("emp4", "Dwight", 25000, new Roles(2));
		
		Employee employees[] = new Employee[4];

		// Assign objects of Employee to employees declared above
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
		//	Create an object of EmployeeReport
		EmployeeReport empReport = new EmployeeReport();
		empReport.setDtReport(dtReport);
		
		// Invoke display() method by passing the employee array
		empReport.display(employees);
	}		
}


















