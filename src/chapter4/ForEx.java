package chapter4;

public class ForEx {

	public static void main(String[] args) {

		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			sum+=num;
		}
		
		System.out.println(num); // 11
		System.out.println(sum); // 56
	}

}
