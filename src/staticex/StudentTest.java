package staticex;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		System.out.println(Student.getSerialNum());
	}

}
