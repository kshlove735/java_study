package string;

public class StringBufferTest {

	public static void main(String[] args) {

		String javaStr = new String("Java");
		// javaStr 문자열 주소 : 1313922862
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		// buffer 문자열 주소 : 960604060
		System.out.println("buffer 문자열 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun~~");
		// 연산 후 buffer 문자열 주소 : 960604060
		System.out.println("연산 후 buffer 문자열 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		// Java and android programming is fun~~
		System.out.println(javaStr);
		// 연결된 javaStr 문자열 주소 : 1349393271
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
