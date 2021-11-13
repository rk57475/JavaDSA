package javadsa;
import java.util.*;

public class SortArrayListinDescendingOrder {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(6);
		list.add(2);
		list.add(9);
		list.add(4);
		list.add(11);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}
}
