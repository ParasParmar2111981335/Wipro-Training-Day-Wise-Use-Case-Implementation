package TwelthDay;
import java.io.*;
import java.util.Scanner;
class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class icici_bank {

	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);

            File file = new File("employee.dat");

            
            System.out.println("File: " + file.getAbsolutePath());

            System.out.println("1. Save Employee  2. View Employee");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter ID Name Salary: ");
                int id = sc.nextInt();
                String name = sc.next();
                double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, salary);

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(emp);   
                oos.close();

                System.out.println("Employee Saved");
            }

            else if (ch == 2) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                Employee emp = (Employee) ois.readObject();  
                ois.close();

                System.out.println("ID: " + emp.id);
                System.out.println("Name: " + emp.name);
                System.out.println("Salary: " + emp.salary);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
