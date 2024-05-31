package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {}
	
	public Person returnSelf() {
		return this;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {

		
		Person p1 = new Person();
		System.out.println(p1);	// thisex.Person@1d81eb93
		System.out.println(p1.returnSelf());	// thisex.Person@1d81eb93
		
	}

}
