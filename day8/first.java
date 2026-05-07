package day8;
import java.util.*;
public class first {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> patients=new ArrayList<>();
		while(true) {
			System.out.println("\n1. Add Patient ");
			System.out.println("2. View All Patients");
			System.out.println("3. Search Patient");
			System.out.println("4. Exit");
			System.out.println("Enter Choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter patient name :");
				String name=sc.nextLine();
				patients.add(name);
				System.out.println("Patient added ");
				break;
				
			case 2:
				System.out.println("\nPatient list :");
				if(patients.isEmpty()) {
					System.out.println("No Patients Found");
				}
				else {
					for(int i=0;i<patients.size();i++) {
						System.out.println((i+1) + " " + patients.get(i));
					}
				}
				break;
				
			case 3:
				System.out.println("Name to Search:");
				String search=sc.nextLine();
				boolean found=false;
				
				for(String p:patients) {
					if(p.equalsIgnoreCase(search)) {
						System.out.println("Patient found: " +p);
						found=true;
						break;
					}
				}
				if(!found) {
					System.out.println("Patients not found");
				}
				break;
				
			case 4:
				System.out.println("Exiting...");
				return;
				default:
					System.out.println("Invalid Choice");
			}
		}

	}

}
