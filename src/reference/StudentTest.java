package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student(100, "James");
		studentJames.setKorea(80);
		studentJames.setMath(40);
		
		Student studentTom = new Student(100, "Tom");
		studentTom.setKorea(30);
		studentTom.setMath(50);
		
		studentJames.showStudentInfo();
		studentTom.showStudentInfo();

	}

}
