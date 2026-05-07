package day8;
import java.util.*;
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}
public class second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        LinkedList<Patient> list = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Add Patient (Normal)");
            System.out.println("2. Add Patient (Emergency - Front)");
            System.out.println("3. Remove Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Check First & Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String name1 = sc.nextLine();
                    list.addLast(new Patient(name1)); 
                    System.out.println("Patient added at end.");
                    break;

                case 2:
                    System.out.print("Enter patient name: ");
                    String name2 = sc.nextLine();
                    list.addFirst(new Patient(name2)); 
                    System.out.println("Emergency patient added at front.");
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("No patients to remove.");
                    } else {
                        Patient removed = list.removeFirst();
                        System.out.println("Removed patient: " + removed.name);
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("No patients in list.");
                    } else {
                        System.out.println("\nPatient List:");
                        int i = 1;
                        for (Patient p : list) {
                            System.out.println(i++ + ". " + p.name);
                        }
                    }
                    break;

                case 5:
                    if (list.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("First Patient: " + list.getFirst().name);
                        System.out.println("Last Patient: " + list.getLast().name);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");

	}
        }
}
}