package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet(new MyCompare());
		
		tree.add("aaa");
		tree.add("bb");
		tree.add("cc");
		
		// [cc, bb, aaa]
		System.out.println(tree);
	}

}
