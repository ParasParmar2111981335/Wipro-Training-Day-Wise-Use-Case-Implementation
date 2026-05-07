package April_BatchDay05;

import java.util.Scanner;

class BankAccount {
    final int accountNumber;
    String name;
    

    BankAccount(int accNo, String name) {
        this.accountNumber = accNo;
        this.name = name;
         
    }
}
public class usecase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        BankAccount acc = new BankAccount(accNo, name);

        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Name: " + name);
        
	}

}
