package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("태백산맥1", "조정래1");
		bookArr1[1] = new Book("태백산맥2", "조정래2");
		bookArr1[2] = new Book("태백산맥3", "조정래3");
		
		// 새로운 인스턴스 생성
		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();
		
		
		// 새로운 인스턴스에 멤버변수 값 복사
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
			bookArr2[i].setBookName(bookArr1[i].getBookName());
		}
		
		bookArr1[0].setAuthor("홍길동");
		bookArr1[0].setBookName("나목");
		
		// 홍길동, 나목
		System.out.println(bookArr1[0].getAuthor() + ", " + bookArr1[0].getBookName());
		// 조정래1, 태백산맥1
		System.out.println(bookArr2[0].getAuthor() + ", " + bookArr2[0].getBookName());
	}

}
