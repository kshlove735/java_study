package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i = 0; i< library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산백1", "조정래1");
		library[1] = new Book("태백산백2", "조정래2");
		library[2] = new Book("태백산백3", "조정래3");
		library[3] = new Book("태백산백4", "조정래4");
		library[4] = new Book("태백산백5", "조정래4");
		
		for(int i = 0; i< library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
