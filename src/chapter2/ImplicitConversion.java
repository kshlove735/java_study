package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		
		// 두 번의 형 변환 발생
		// fNum + num을 수행하기 위해 num이 float형으로 형 변환
		// fNum + num의 결과값이 double 형으로 형 변환되어 dNum에 할당
		double dNum = fNum + num;
		
		System.out.println(dNum); // 20.0

	}

}
