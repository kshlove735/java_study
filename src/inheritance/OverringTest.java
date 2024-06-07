package inheritance;

public class OverringTest {

	public static void main(String[] args) {

//		Customer customerL = new Customer(10010, "Lee");
//		int price = customerL.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "이고 " + customerL.showCustomerInfo());
//		 
//		VIPCustomer customerK = new VIPCustomer(10010, "Kim", 1);
//		price = customerK.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "이고 " + customerK .showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(10020, "who", 2);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "이고 " + customerWho .showCustomerInfo());
	}

}
