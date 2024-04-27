package chapter4;

public class WhileEx {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num>10) {
			sum += num;
			num++;
		}
		System.out.println(num); // 1
		System.out.println(sum); // 0
		
		
		int num1 = 1;
		int sum1 = 0;
		
		do {
			sum1 += num1;
			num1++;
		}while(num1 > 10);
		System.out.println(num1); // 2
		System.out.println(sum1); // 1
	}

}
