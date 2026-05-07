
package April_BatchDay02;
import java.util.*;
public class even_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
	}

}
