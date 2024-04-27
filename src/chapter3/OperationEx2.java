package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		

		// && 연산 중 첫번째 항이 false 이면 두번째 항은 연산 X 하고 무조건 false 
		// 첫 번째 항인 ((num1 = num1 + 10) < 10)이 false 이므로 무조건 false -> num1은 20
		// 두 번째 항인 ((i = i + 2) < 10)은 연산하지 않음 -> i는 여전히 2
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);	// false
		
		// || 연산 중 첫번째 항이 true 이면 두번째 항은 연산 X 하고 무조건 true 		
		// 첫 번째 항인 ((num1 = num1 + 10) > 10)이 true 이므로 무조건 true -> num1은 30
		// 두 번째 항인 ((i = i + 2) < 10)은 연산하지 않음 -> i는 여전히 2
		value = ((num1 = num1 + 10) > 10) || ((i = i +2) < 10);
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i);	// 2
	}

}
