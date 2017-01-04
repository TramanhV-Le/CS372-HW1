
public class EmployeeClassTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClass E1 = new EmployeeClass ("Athena","Vincent",1600);
		EmployeeClass E2 = new EmployeeClass ("Brady","Ariston", 1500);
		double E1Salary = E1.getSalary()*12;
		double E2Salary = E2.getSalary()*12;
		System.out.printf("%s's yearly income is %f. \n", E1.getName(),E1Salary);
		System.out.printf("%s's yearly income is %f. \n", E2.getName(),E2Salary);
		E1.setSalary(1760);
		E2.setSalary(1650);
		E1Salary = E1.getSalary()*12;
		E2Salary = E2.getSalary()*12;
		System.out.printf("%s's yearly income is %f. \n", E1.getName(),E1Salary);
		System.out.printf("%s's yearly income is %f. \n", E2.getName(),E2Salary);
	}
}