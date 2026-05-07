package April_BatchDay03;
class Voter{
	private String name;
	private boolean voted;
	
	Voter(String name){
		this.name=name;
		this.voted=false;
	}
	
	void vote() {
		if(!this.voted) {
			this.voted=true;
			System.out.println("Voted");
		}
		else {
			System.out.println("Already Voted ");
		}
	}
	
	void display() {
		System.out.println(name + " " + voted );
	}
}
public class usecase05 {

	public static void main(String[] args) {
		Voter v=new Voter("Paras");
		v.vote();
		v.vote();
		
		v.display();
	}

}
