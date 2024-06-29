package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// 인스턴스 내부 클래스
	private class InClass{
		int inNum = 200;
		// 내부 클래스에서는 static 변수, 메서드 생성 X
		// static int sInNum = 100;
		
		// 모든 내부 클래스는 외부 클래스에 대한 참조 값을 가지고 있음
		// 외부 클래스 안에 있기 때문에 외부 클래스의 모든 변수와 메소드를 사용할 수 있음
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	// 정적 내부 클래스
	// 외부 클래스 생성과 무관하게 생성 가능
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// 외부 클래스 생성과 무관하게 사용 가능하기 때문에 외부 클래스 멤버 변수 사용 X
			// num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}
