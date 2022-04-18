package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list =new ArrayList<String> ();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		
		for(int i=0; i< list.size();i++) {
			String s= list.get(i);
		}
	}

}
