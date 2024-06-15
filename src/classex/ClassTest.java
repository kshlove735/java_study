package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		// static 로딩
		Class pClass1 = person.getClass();
		
		Class pClass2 = Person.class;
		
		// 동정 로딩
		Class pClass3 = Class.forName("classex.Person"); 
		
		
		// classex.Person
		System.out.println(pClass1.getName());
		System.out.println(pClass2.getName());
		System.out.println(pClass3.getName());
	}

}
