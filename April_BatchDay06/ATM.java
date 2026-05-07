package April_BatchDay06;
import java.util.Scanner;

class atmPin extends Exception{  
	public atmPin(String message) {
		super(message);
	}
}
public class ATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int correctPin=1234;
		
		try {
			System.out.println("Inserts Card... ");
			System.out.print("Enter PIN :");
			int enteredPin=sc.nextInt();
			
			if(enteredPin!=correctPin) {
				throw new atmPin("Wrong PIN!! ");
			}
			System.out.println("PIN Verified. Access Granted");
		}
		catch(atmPin e) {
			System.out.println("Exception : " + e.getMessage());
		}
		finally {
			System.out.println("Transaction Logged ");
		}
		sc.close();
	}

}
