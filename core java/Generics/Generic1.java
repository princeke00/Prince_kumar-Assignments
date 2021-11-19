import java.util.HashSet;
import java.util.Set;

class Employee1231 {
	int id;
	String name;
	String dept;
	int salary;

	public Employee1231(int id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee123 Details [id=" + id + ", name=" + name + ", dept=" + dept + ",salary=" + salary + "]";
	}

}
public class Generic1 {

	public static void main(String[] args) {
		Set<Employee1231> emp = new HashSet<>();
		emp.add(new Employee1231(101, "rahul", "Deveops", 30000));
		emp.add(new Employee1231(11, "Maninder", "dba", 45000));
		emp.add(new Employee1231(18, "Prince", "developer", 30000));

		for (Employee1231 e : emp) {
			System.out.println(e);
		}

	}
}


