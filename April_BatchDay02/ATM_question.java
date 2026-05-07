package April_BatchDay02;

import java.util.Scanner;

public class ATM_question {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int option;
	do {
		System.out.println("1: Check Balance");
		System.out.println("2:deposit");
		System.out.println("3. wihdraw");
		System.out.println("4: Exit");
		System.out.println("Enter your option");
		option=sc.nextInt();
		System.out.println("Selected option "+option);
	}
	while(option!=4);
	System.out.println("Exited ATM");
	sc.close();
	}
}
