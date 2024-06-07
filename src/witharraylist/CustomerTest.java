package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customserL = new Customer(10010, "이순신");
		Customer customserS = new Customer(10010, "신사임당");
		Customer customserH = new GoldCustomer(10010, "홍길동");
		Customer customserY = new GoldCustomer(10010, "이율곡");
		Customer customserK = new VIPCustomer(10010, "김유신", 123);
		
		customerList.add(customserL);
		customerList.add(customserS);
		customerList.add(customserH);
		customerList.add(customserY);
		customerList.add(customserK);
		
		System.out.println("+++++++++++ 고객 정보 출력 +++++++++++");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("+++++++++++ 할인율과 보너스 포인트 결과 +++++++++++");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하였습니다.");
			System.out.println(customer.showCustomerInfo());
		}
		
		
	}

}
