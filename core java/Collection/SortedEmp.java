import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortedEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose between following options:");
		System.out.println("1.ID|2.Name|3.Department|4.Salary");
		int choose=sc.nextInt();
		TreeSet<Employee14> emp=null;
		switch(choose)
		{
			case 1: emp=new TreeSet<>(new IdComp());
					break;
			case 2: emp=new TreeSet<>(new NameComp());
					break;
			case 3:	emp=new TreeSet<>(new DeptComp());
					break;
			case 4: emp=new TreeSet<>(new SalComp());
					break;
			default:System.out.println("Invalid Option");
		}
		emp.add(new Employee14(10,"Naruto","IT",2000));
		emp.add(new Employee14(11,"Luffy","Management",2200));
		emp.add(new Employee14(12,"Goku","HR",1800));
		emp.add(new Employee14(13,"Madara","Management",1900));
		emp.add(new Employee14(14,"Itachi","HR",2100));
		emp.add(new Employee14(16,"Vegeta","Training",2400));
		emp.add(new Employee14(15,"Karma","IT",2000));
		emp.add(new Employee14(19,"Leleouch","IT",2300));
		emp.add(new Employee14(17,"Minato","HR",1900));
		emp.add(new Employee14(18,"Gohan","Management",1700));
		
		for(Employee14 e:emp)
		{
			System.out.println(e);
		}
	}

}

class IdComp implements Comparator<Employee14> {
	@Override
	public int compare(Employee14 o1, Employee14 o2) {
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class NameComp implements Comparator<Employee14>{
	@Override
	public int compare(Employee14 o1, Employee14 o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
class DeptComp implements Comparator<Employee14>{
	@Override
	public int compare(Employee14 o1, Employee14 o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
}
class SalComp implements Comparator<Employee14>{
	@Override
	public int compare(Employee14 o1, Employee14 o2) {
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Employee14{
	
	int id;
	String name;
	String department;
	int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee14(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee14 [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}