package TwelthDay;
import java.io.*;
import java.util.Scanner;
public class banking {

	public static void main(String[] args) throws Exception{
		try {
            Scanner sc = new Scanner(System.in);

            File file = new File("data.txt");

            
            System.out.println("File location: " + file.getAbsolutePath());

            System.out.println("1. Add Account  2. View Accounts");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter AccNo Name Balance: ");
                int acc = sc.nextInt();
                String name = sc.next();
                double bal = sc.nextDouble();

                FileWriter fw = new FileWriter(file, true);
                fw.write(acc + " " + name + " " + bal + "\n");
                fw.close();

                System.out.println("Saved");
            }

            else if (ch == 2) {
                BufferedReader br = new BufferedReader(new FileReader(file));
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
