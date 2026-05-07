package TwelthDay;
import java.io.*;
import java.util.Scanner;
public class husptaal {

	public static void main(String[] args) {
		 try {
	            Scanner sc = new Scanner(System.in);

	            File patientFile = new File("patients.txt");
	            File reportFile = new File("reports.txt");

	            
	            System.out.println("Patient File: " + patientFile.getAbsolutePath());
	            System.out.println("Report File: " + reportFile.getAbsolutePath());

	            System.out.println("1. Add Patient  2. View Patients");
	            int ch = sc.nextInt();

	            if (ch == 1) {
	                System.out.print("Enter ID Name Disease: ");
	                int id = sc.nextInt();
	                String name = sc.next();
	                String disease = sc.next();

	                System.out.print("Enter Report: ");
	                String report = sc.next();

	                
	                FileWriter pw = new FileWriter(patientFile, true);
	                pw.write(id + " " + name + " " + disease + "\n");
	                pw.close();

	               
	                FileWriter rw = new FileWriter(reportFile, true);
	                rw.write("ID: " + id + " Report: " + report + "\n");
	                rw.close();

	                System.out.println("Saved Successfully");
	            }

	            else if (ch == 2) {
	                BufferedReader br = new BufferedReader(new FileReader(patientFile));
	                String line;

	                while ((line = br.readLine()) != null) {
	                    System.out.println(line);
	                }
	                br.close();
	            }

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
