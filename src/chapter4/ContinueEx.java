package chapter4;

public class ContinueEx {

	public static void main(String[] args) {

		int total = 0;
		
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) continue;
			
			// (num % 2 == 0)이 true 경우 아래 코드 실행 X
			System.out.println(num);
			total += num;
		}
		System.out.println(total);
	}

}
