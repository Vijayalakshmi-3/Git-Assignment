package Assignment_2;

public class _2_PolymorphismToFindTotalSalary {

	public static void main(String[] args) {
		_2_Labour labour=new _2_Labour();
		_2_Manager manager=new _2_Manager();
		_2_Employee employee= new _2_Employee();
		System.out.println("All employee salary:"+employee.getSalary()+"\nAll employee overtime:"+employee.overtime);
		labour.setSalary(1000);
		manager.setSalary(10000);
		System.out.println("Manager salary:"+manager.getSalary()+"\nManager overtime:"+manager.overtime);
		System.out.println("Labour salary:"+labour.getSalary()+"\nLabour overtime:"+labour.overtime);
	}

}
