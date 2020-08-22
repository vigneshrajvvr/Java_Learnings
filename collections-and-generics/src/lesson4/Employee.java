package lesson4;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private String department;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getSalary() < o.getSalary()) {
			return 1;
		}else if(this.getSalary() > o.getSalary()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
