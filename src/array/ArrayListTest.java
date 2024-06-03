package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// 제네릭을 이용하여 타입을 설정한 경우
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		// 제네릭을 이용하여 타입을 설정하지 않은 경우 -> Object로 인식 -> 형 변환 필요
		ArrayList list2 = new ArrayList();
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		
		for(int i = 0; i < list2.size(); i++) {
			String s = (String)list2.get(i);
		}
		
	}

}
