package din11;
import java.io.*;
public class buffwrite {

	public static void main(String[] args) {
		try {
			BufferedWriter bf=new BufferedWriter(new FileWriter("output.txt"));
			bf.write("Hello World!");
			bf.newLine();
			bf.write("this is written using bufferreader");
			bf.close();
			System.out.println("File Written Successfully");
		}
		catch(IOException e) {
			System.out.println("An error occured : " + e.getMessage());
		}

	}

}
