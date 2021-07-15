public class EmployeeReport {
	
	private String dtReport;
	
	public EmployeeReport(String dtReport) {
		this.dtReport = dtReport;
	}
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\t\tHRA\t\tALLOW\t\tSALARY");
		
		// Complete the logic 	
		for(Employee emp : empArr) {
			System.out.printf("%s\t%s\t%s\t%.3f\t%.3f\t%.3f\t%.3f\n",
								emp.getEmpId(), 
								emp.getName(), 
								emp.getRoleDescription(),
								emp.getBasic(), 
								emp.getHra(), 
								emp.getAllowance(),
								emp.getSalary());
		}
		
		displayFooter(empArr.length);
		
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}