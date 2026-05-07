package April_BatchDay03;

class Employee{
	private String name;
	private int id;
	private double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	double getSalary() {
		return this.salary;
	}
	void getSalary(double Salary) {
		this.salary=salary;
	}
	void display() {
		System.out.println(name + " " + id + " " + salary);
	}
}

public class usecase01 {

	public static void main(String[] args) {
		Employee e=new Employee("Paras",101,30000);
		e.display();
	}

}
