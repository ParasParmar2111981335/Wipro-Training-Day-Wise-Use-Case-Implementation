package April_BatchDay02;
import java.util.*;
public class shopping_cart {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		while(true) {
			System.out.print("Enter price: ");
			int price =sc.nextInt();
			if(price==0) {
				break;
			}
			
			total=total+price;
		}
		System.out.println("Total: " + total);
		sc.close();
	}

}
