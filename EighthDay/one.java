package EighthDay;
import java.util.*;
class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.id == p.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + "  " + name;
    }
}
public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashSet<Person> set = new HashSet<>();

        int n = sc.nextInt(); // number of entries

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();

            Person p = new Person(id, name);

            if (set.contains(p)) {
                System.out.println("Already registered");
            } else {
                set.add(p);
                System.out.println("Patient added to the system");
            }
        }

        System.out.println("\nUnique Registered Patients:");
        for (Person p : set) {
            System.out.println(p);

	}
	}
}
