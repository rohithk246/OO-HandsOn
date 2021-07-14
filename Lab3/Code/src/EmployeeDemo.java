public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		emp.setEmpId(Console.readLine());
		
		System.out.println("Enter Name : ");
		emp.setName(Console.readLine());
		
		Address addr = new Address();
		System.out.println("Address Line1 : ");
		addr.setAddr1(Console.readLine());
		
		System.out.println("Address Line2 : ");
		addr.setAddr2(Console.readLine());
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		addr.setCity(city);
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		addr.setPin(pin);

		emp.setAddress(addr);
	}
	
	public static void showData(Employee emp) {
		System.out.println("--------------------------------------------");
		System.out.println("Emp Id : " + emp.getEmpId());
		System.out.println("Name : " + emp.getName());
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : " + emp.getAddress().getAddr1());
		System.out.println("Addr Line2 : " + emp.getAddress().getAddr2());
		System.out.println("City : " + emp.getAddress().getCity());
		System.out.println("Pin : " + emp.getAddress().getPin());
		System.out.println("--------------------------------------------");
	}
}














