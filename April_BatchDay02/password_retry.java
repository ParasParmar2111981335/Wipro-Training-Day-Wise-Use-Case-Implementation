package April_BatchDay02;
import java.util.*;
public class password_retry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int correct=1234;
		int i=1;
		while(i<=3) {
			System.out.print("Enter your password" );
			int p=sc.nextInt();
			
			if(p==correct) {
				System.out.println("Success");
				break;
			}
			else {
				System.out.println("Wrong");
			}
			i++;
		}
		}

	}


