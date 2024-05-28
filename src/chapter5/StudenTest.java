package chapter5;

public class StudenTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
		studentLee.address= "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID=101;
		studentKim.address= "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
	}

}
