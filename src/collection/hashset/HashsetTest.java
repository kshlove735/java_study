package collection.hashset;

import java.util.HashSet;

public class HashsetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		// [aaa, ccc, bbb]
		System.out.println(set);
		
		set.add("bbb");
		
		// [aaa, ccc, bbb]
		System.out.println(set);
	}

}
