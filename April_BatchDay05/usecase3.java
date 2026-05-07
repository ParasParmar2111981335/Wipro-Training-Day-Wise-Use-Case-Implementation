package April_BatchDay05;
import java.util.Scanner;
class paisa {

    final void processPayment(int amount) {
        System.out.println("Payment of " + amount + " processed securely");
    }
}

class UPI extends paisa {
    void show() {
        System.out.println("Using UPI method");
    }
}
public class usecase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        UPI obj = new UPI();

        obj.processPayment(amount); 
        obj.show();

	}

}
