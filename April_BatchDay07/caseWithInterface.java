package April_BatchDay07;

class OrderProcessing implements Runnable{
	public void run() {	
	try {
		System.out.println("Order Processing Started ");
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
		}
}

class PaymentProcessing implements Runnable{
	public void run() {
	try {
		System.out.println("Payment Processing ");
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println("Payment Processing Completed ");
	}
}

class Notification implements Runnable{
	public void run() {
	try {
		System.out.println("Sending Notification ");
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println("Notification Sent");
	}
}
public class caseWithInterface {

	public static void main(String[] args) throws InterruptedException{
		OrderProcessing order=new OrderProcessing();
		PaymentProcessing payment=new PaymentProcessing();
		Notification n=new Notification();
		
		Thread t1=new Thread(order);
		Thread t2=new Thread(payment);
		Thread t3=new Thread(n);
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}

}
