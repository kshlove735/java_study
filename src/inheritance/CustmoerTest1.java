package inheritance;

public class CustmoerTest1 {

	public static void main(String[] args) {

//		Customer customerL = new Customer();
//		customerL.setCustomerID(10100);
//		customerL.setCustomerName("Lee");
		
		
		VIPCustomer customerK = new VIPCustomer(10200, "Kim", 1);
		customerK.bonusPoint = 1000;
		
//		System.out.println(customerL.showCustomerInfo());
		System.out.println(customerK.showCustomerInfo());
	}

}
