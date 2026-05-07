package Day10;
import java.util.*;
import java.util.Arrays;

public class merginTwointoThree {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>(Arrays.asList("Paras"));
		ArrayList<String> list2=new ArrayList<>(Arrays.asList("OM"));
		ArrayList<String> list3=new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);

	}

}
