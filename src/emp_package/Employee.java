package emp_package;

public class Employee {
	private String name;
	private Designation designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
	

}
