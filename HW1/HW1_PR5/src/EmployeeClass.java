
public class EmployeeClass {
		String name;
		String lastName;
		double salary = 0;
	public EmployeeClass(String newName, String newLast, double newSal) {
		name = newName;
		lastName = newLast;
		salary = newSal;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setLastName(String newLast) {
		lastName = newLast;
	}
	public String getLastName() {
		return lastName;
	}
	public void setSalary(double newSal) {
		salary = newSal;
	}
	public double getSalary() {
		return salary;
	}

}