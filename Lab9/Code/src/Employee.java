public class Employee {
	
	// Identity variables of Employee 
	private String empId, name;
	private double salary;
	private Roles role;
	
	public Employee(String empId, String name, double salary, Roles role) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.role = role;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	
}




















