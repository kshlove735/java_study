package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	
}


public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("두잇자바", "은종님");
		// 원래는 "object.Book@1d81eb93"로 출력 but 재정의해서 "두잇자바, 은종님" 로 출력
		System.out.println(book);
		
		String str = new String("test");
		// String 클래스의 toString은 문자열을 출력하도록 재정의되어있음
		System.out.println(str);	// test
		
		Integer num = new Integer(100);
		System.out.println(num);
	}

}
