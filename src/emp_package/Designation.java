package emp_package;

public class Designation {
	private String designation,description;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Employees [designation=" + designation + ", description=" + description + "]";
	}
	
}
