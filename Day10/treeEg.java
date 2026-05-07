package Day10;
import java.util.*;
class People implements Comparable<People>{
	int id;
	String name;
	
	People(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(People p) {
		return this.id-p.id;
	}
	
	public String toString() {
		return "ID:" +id +",Name:" +name;
	}
}
public class treeEg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<People> peoples=new TreeSet<>();
		System.out.print("Enter Number of Patients : ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
		System.out.print("Enter Patient ID : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter patient name :");
		String name=sc.nextLine();
		People p=new People(id,name);
		
		if(peoples.add(p)) {
			System.out.println("Patient added to the system ");
		}
		else {
			System.out.println("ID already registered ");
			System.out.println(" Already registered ");
		}
	}
		System.out.println("\nUnique Registered Patients: ");
		for(People p:peoples) {
			System.out.println(p);
		}
}
}
