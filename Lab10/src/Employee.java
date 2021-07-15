public class Employee {
	
	// Identity variables of Employee 
	private String empId, name;
	private double basic, hra, allowancePercentage;
	private Roles role;
	

	public Employee(String empId, String name, double basic, double hra, double allowancePercentage, int roleId) {
		this.empId = empId;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.allowancePercentage = allowancePercentage;
		this.role = new Roles(roleId);
	}
	
	// Create getter and setter methods
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getAllowancePercentage() {
		return allowancePercentage;
	}

	public void setAllowancePercentage(double allowancePercentage) {
		this.allowancePercentage = allowancePercentage;
	}
	
	public double getSalary() {
		return SalaryCalculator.getSalary(this);
	}
	public double getAllowance() {
		return SalaryCalculator.getAllowance(this);
	}
}

