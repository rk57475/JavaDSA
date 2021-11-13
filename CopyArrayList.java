package javadsa;
import java.util.*;
public class CopyArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		ArrayList<Integer> list2 = ((ArrayList<Integer>)list.clone());
		
		System.out.println(list);
		System.out.println(list2);
		
	}
}