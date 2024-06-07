package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		// 추상 메서드는 인스턴스화 X
		// Computer c1 = new Computer();
		Computer c2 = new DeskTop();

		// 추상 메서드는 인스턴스화 X
		// Computer c3 = new NoteBook();
		
		Computer c4 = new MyNoteBook();
		
		c2.display(); // DeskTop display()
		c4.display(); // NoteBook display()
	}

}
