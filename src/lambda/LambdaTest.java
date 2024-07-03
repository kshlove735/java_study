package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {

		// 변수에 람다식 대입
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		// 매개변수로 전달하는 람다식
		showMyString(lambdaPrint);
		
		// 반환 값으로 쓰이는 람다식
		PrintString reStr = returnPrint();
		reStr.showString("Hello");
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}
	
	// 매개변수로 전달하는 람다식
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}

	// 반환 값으로 쓰이는 람다식
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	}

}
