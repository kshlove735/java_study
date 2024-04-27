package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {

//		int num1 = 5;
//		int num2 = 10;
//		
//		String bNum1 = Integer.toBinaryString(num1);
//		String bNum2 = Integer.toBinaryString(num2);
//		
//		int num1ANDNum2 = num1 & num2;
//		System.out.println(String.format("%8s", bNum1).replace(" ", "0"));       // 00000101
//		System.out.println(String.format("%8s", bNum2).replace(" ", "0"));       // 00001010
//		System.out.println(String.format("%8s", Integer.toBinaryString(num1ANDNum2)).replace(" ", "0")); // 00000000
//		
//		int num1ORNum2 = num1 | num2;
//		System.out.println(String.format("%8s", bNum1).replace(" ", "0"));      // 00000101
//		System.out.println(String.format("%8s", bNum2).replace(" ", "0"));      // 00001010
//		System.out.println(String.format("%8s", Integer.toBinaryString(num1ORNum2)).replace(" ", "0")); // 00001111
//		
//		int num3 = 5;
		int num3 = 0B10010000000000000000000000000001;
		System.out.println(num3);
		System.out.println(String.format("%32s", Integer.toBinaryString(num3)).replace(" ", "0")); 
		System.out.println(num3 << 1); // 5 * 2^1 = 10
		System.out.println(String.format("%32s", Integer.toBinaryString(num3<<1)).replace(" ", "0"));
		System.out.println(num3 << 2); // 5 * 2^2 = 20
		System.out.println(num3 << 3); // 5 * 2^3 = 40
		
		
		System.out.println(num3 >> 1);  // 5 / 2^1 = 2.5 -> int는 정수 2
		System.out.println(String.format("%32s", Integer.toBinaryString(num3>>1)).replace(" ", "0"));
		System.out.println(num3 >> 2); // 5 / 2^2 = 1.25 -> int는 정수 1
		System.out.println(String.format("%32s", Integer.toBinaryString(num3>>2)).replace(" ", "0"));
	}

}
