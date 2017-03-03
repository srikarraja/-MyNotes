package first;
public class Employee{
	int empid;
	String name;
	public Employee(int empid,String name){
		this.empid = empid;
		this.name = name;
	}
	public void showEmployee(){
		System.out.println("Emp id is" + empid);
		System.out.println("Name is" + name);
	}
}