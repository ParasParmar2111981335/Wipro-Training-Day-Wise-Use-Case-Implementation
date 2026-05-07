package TwelthDay;
import java.io.*;
import java.util.Scanner;
public class ecommerce {

	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter OrderID Product Price: ");
            int id = sc.nextInt();
            String product = sc.next();
            double price = sc.nextDouble();

            System.out.print("Enter Address: ");
            String address = sc.next();

            
            File orderF = new File("orders.txt");
            File invoiceF = new File("invoices.txt");
            File shipF = new File("shipping.txt");

            
            System.out.println("Orders file: " + orderF.getAbsolutePath());
            System.out.println("Invoices file: " + invoiceF.getAbsolutePath());
            System.out.println("Shipping file: " + shipF.getAbsolutePath());

            
            FileWriter orderFile = new FileWriter(orderF, true);
            orderFile.write(id + " " + product + " " + price + "\n");
            orderFile.close();

            
            FileWriter invoiceFile = new FileWriter(invoiceF, true);
            invoiceFile.write("OrderID: " + id + " Amount: " + price + "\n");
            invoiceFile.close();

            
            FileWriter shipFile = new FileWriter(shipF, true);
            shipFile.write("OrderID: " + id + " Address: " + address + "\n");
            shipFile.close();

            System.out.println("Order Saved Successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
