package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		// override 했기 때문에 "고객 판매 주문"로 출력
		customer.order();
		buyer.order();
		seller.order();
		
	}

}
