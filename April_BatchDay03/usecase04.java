package April_BatchDay03;

class Patient{
	private String name;
	private int id;
	private String disease;
	
	Patient(String name,int id,String disease){
		this.name=name;
		this.id=id;
		this.disease=disease;
	}
	
	String getDisease() {
		return this.disease;
	}
	
	void setDisease(String disease) {
		this.disease=disease;
	}
	
	void display() {
		System.out.println(name + " " + id + " " + disease);
	}
}
public class usecase04 {

	public static void main(String[] args) {
		Patient p=new Patient("Paras" ,101, "Flu");
		p.display();
		
		p.setDisease("Cold");
		System.out.println("Updated : " + p.getDisease());
	}

}
