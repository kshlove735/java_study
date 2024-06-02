package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);  // singleton.Company@1d81eb93
		System.out.println(c2);  // singleton.Company@1d81eb93
	}

}
