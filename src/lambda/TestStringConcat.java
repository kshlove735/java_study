package lambda;

public class TestStringConcat {
	
	public static void main(String[] args) {
		
		// 객체지향 프로그래밍 방식
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		// 람다식 방식
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		concat2.makeString("hello", "java");
		
	}
	
	
}
