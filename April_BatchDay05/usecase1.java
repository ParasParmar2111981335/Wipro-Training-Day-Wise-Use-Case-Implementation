package April_BatchDay05;

import java.util.Scanner;

interface Payment{
	void pay(double amount);
    default void paymentStatus() {
	System.out.println("Payment completed successfully ");
}
}

class CreditCardPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Paid " + amount+ " using Credit Card ");
	}
}

class UPIPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using UPI");
	}
}
public class usecase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount :");
		double amount=sc.nextDouble();
		System.out.println("Choose Payment Method");
		System.out.println("1. Credit Card");
		System.out.println("2. UPI");
		
		int choice=sc.nextInt();
		
		Payment p;
		if(choice==1) {
			p=new CreditCardPayment();
		}
		else if(choice==2) {
			p=new UPIPayment();
		}
		else {
			System.out.println("Dont want anything");
			return;
		}
		
		p.pay(amount);
		p.paymentStatus();
	}

}
