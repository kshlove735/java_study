package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {

		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 호출");
	}
	
	public VIPCustomer(int customerID, String customerName) {

		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(매개변수) 호출");
	}

	public int getAgentID() {
		return agentID;
	}
	
}
