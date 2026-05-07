package April_Batch;

public class usecase05 {
	public static void main(String[] args) {
		int basic=20000;
		int bonus=5000;
		int tax=3000;
		double netsalary=basic+bonus-tax;
		
		System.out.println("Basic:" +basic);
		System.out.println("bonus: " +bonus);
		System.out.println("tax: " +tax);
		System.out.println("netsalary: " + netsalary);
	}
}
