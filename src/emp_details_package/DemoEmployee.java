package emp_details_package;

//import emp_package.Designation;
//import emp_package.Employee;
import emp_package.*;


public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Designation d = new Designation();
		d.setDesignation("fullstackdeveloper");
		d.setDescription("devloping fullstack projects");
		
		Employee e = new Employee();
		e.setName("Meet Soni");
		e.setDesignation(d);
		System.out.println(e);
	}

}
