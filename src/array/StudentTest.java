package array;

public class StudentTest {

	public static void main(String[] args) {

		Student studentK = new Student(1001, "김홍도");
		studentK.addSubject("언어", 80);
		studentK.addSubject("수리", 70);
		
		studentK.showStudentInfo();
		
		System.out.println("===========================");
		
		Student studentL = new Student(1002, "이완용");
		studentL.addSubject("언어", 30);
		studentL.addSubject("수리", 20);
		studentL.addSubject("영어", 10);
		
		studentL.showStudentInfo();
		
	}

}
