package April_BatchDay03;

class BankAccount{
	private String name;
	private int accNumber;
	private double balance;
	
	BankAccount(String name,int accNumber,double balance){
		this.name=name;
		this.accNumber=accNumber;
		this.balance=balance;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			this.balance+=amount;
		}
	}
		
	void withdraw(double amount) {
		if(amount>0 && amount<=this.balance)
			this.balance-=amount;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	void display() {
		System.out.println(name + " " + accNumber + " " + balance);
	
	}
}
public class usecase02 {

	public static void main(String[] args) {
		BankAccount b=new BankAccount("Paras",101,10000);
		b.deposit(5000);
		b.withdraw(3000);
		
		b.display();
	}

}
