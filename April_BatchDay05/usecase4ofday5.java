package April_BatchDay05;
import java.util.Scanner;
final class SecurityModule {
    
    void encryptData(String data) {
        System.out.println("Encrypting data: " + data);
    }
}
public class usecase4ofday5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter data to encrypt: ");
        String data = sc.nextLine();

        SecurityModule obj = new SecurityModule();
        obj.encryptData(data);

	}

}
