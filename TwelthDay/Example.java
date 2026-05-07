package TwelthDay;
import java.io.*;
public class Example {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("hero.txt");
			fw.write("Hello world!\n");
			fw.write("This is java IO example.\n");
			fw.write("File writing and reading done");
			fw.close();
			
			System.out.println("File written successfully");
			FileReader fr=new FileReader("hero.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			System.out.println("Reading file content:\n ");
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
