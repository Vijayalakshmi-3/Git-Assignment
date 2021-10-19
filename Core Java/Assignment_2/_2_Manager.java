package Assignment_2;

public class _2_Manager extends _2_Employee {
	@Override
	int getSalary() {
		salary = salary + (salary * 10 / 100);
		overtime=0;
		return salary;
	}
}
