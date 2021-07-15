public class TestMain {
	public static void main(String[] args) {
		
		Employee employees[] = new Employee[4];

		// Assign objects of Employee to employees declared above
		for(int i=0;i<employees.length;i++) {
			employees[i] = new Employee();
			System.out.println("Enter employee data for employee" + (i+1));
			System.out.println("Enter empId : ");
			employees[i].setEmpId(Console.readLine());
			System.out.println("Enter employee Name : ");
			employees[i].setName(Console.readLine());
			System.out.println("Enter employee basic salary : ");
			employees[i].setBasic(Console.readDouble());
			System.out.println("Enter employee HRA : ");
			employees[i].setHra(Console.readDouble());
			System.out.println("Enter employee allowance percentage : ");
			employees[i].setAllowancePercentage(Console.readDouble());
			System.out.println("Enter employee role id : ");
			employees[i].setRoleId(Console.readInt());
		}
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
		//	Create an object of EmployeeReport
		EmployeeReport empReport = new EmployeeReport(dtReport);
		
		// Invoke display() method by passing the employee array
		empReport.display(employees);
	}		
}


















