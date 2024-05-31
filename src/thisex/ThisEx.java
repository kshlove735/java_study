package thisex;


class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		  this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}



public class ThisEx {

	public static void main(String[] args) {

		Birthday day1 = new Birthday();
		
		System.out.println(day1);	// thisex.Birthday@1d81eb93
		System.out.println("---------------");
		day1.printThis();	// thisex.Birthday@1d81eb93
	}

}
