package miniproject;

public class Employer {
	private String emp_name;
	private String emp_roll;
	private double emp_salary;
	Employer(String emp_name,String emp_roll,double emp_salary){
		this.emp_name = emp_name;
		this.emp_roll=emp_roll;
		this.emp_salary=emp_salary;
	}
// get emp name 
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	// get emp name  salary
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
// get emp roll
	public String getEmp_roll() {
		return emp_roll;
	}
	public void setEmp_roll(String emp_roll) {
		this.emp_roll = emp_roll;
	}
}
