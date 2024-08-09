package exceptionexample;

public class Employee extends Customsalary{
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) throws Customsalary {
		if(salary>=10000 && salary<=25000) {
		this.salary = salary;
			
		}else {
			throw new Customsalary();
		}
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
