package Day10;
import java.util.*;
class Person {
    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
public class EgHash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap<Integer, Person> map = new HashMap<>();

        while (true) {
            System.out.println("\n1.Add 2.Update 3.Get 4.Remove 5.List 6.Check 7.Count 8.Clear 9.Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: 
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (map.containsKey(id)) {
                        System.out.println("ID already exists");
                    } else {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        map.put(id, new Person(id, name, age));
                        System.out.println("Patient added");
                    }
                    break;

                case 2: 
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    if (map.containsKey(id)) {
                        System.out.print("Enter New Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter New Age: ");
                        int age = sc.nextInt();

                        map.put(id, new Person(id, name, age));
                        System.out.println("Patient updated");
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 3: 
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();

                    if (map.containsKey(id)) {
                        System.out.println(map.get(id));
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 4: 
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();

                    if (map.remove(id) != null) {
                        System.out.println("Patient removed");
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 5: 
                    if (map.isEmpty()) {
                        System.out.println("No patients");
                    } else {
                        for (Person p : map.values()) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 6: 
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();

                    if (map.containsKey(id)) {
                        System.out.println("Patient exists");
                    } else {
                        System.out.println("Patient does not exist");
                    }
                    break;

                case 7: 
                    System.out.println("Total Patients: " + map.size());
                    break;

                case 8: 
                    map.clear();
                    System.out.println("All records cleared");
                    break;

                
	}
        }
	}
}
