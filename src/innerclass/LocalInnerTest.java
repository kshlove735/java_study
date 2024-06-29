package innerclass;

class Outer{
	int outNum =100;
	static int sNum = 200;
	
	// 익명 내부 클래스
	Runnable runnable = new Runnable() {
	
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable(int i) {

		// i, localNum 은 getRunnable()가 호출 되면 사라진다.(stack에 쌓이기 때문)
		// i, localNum은 상수화가 된다(final)
		// so, run()를 호출 할때 사용 할 수 있으나 수정, 변경 X
		int localNum = 300;
		
		// 지역 내부 클래스
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				outNum += 10;
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
			}
		}
		return new MyRunnable();
	}
	
	public Runnable getRunnable2(int i) {
		int localNum = 300;
		
		// 익명 내부 클래스
		return new Runnable() {
			
			@Override
			public void run() {
				outNum += 10;
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
				
			}
		};
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
		
		
		outer.runnable.run();
		
		Runnable runnable2 = outer.getRunnable2(20);
		runnable.run();
	}

}
