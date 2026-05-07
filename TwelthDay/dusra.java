package TwelthDay;
import java.io.*;
class Demo implements Serializable {
    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
public class dusra {

	public static void main(String[] args) {
		Demo object = new Demo(1, "geeksforgeeks");
        String filename = "file.ser";

        
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        Demo object1 = null;

	}

}
