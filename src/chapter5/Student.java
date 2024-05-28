package chapter5;

public class Student {

	// 멤버 변수
	int studentID;
	String studentName;
	int grade;
	String address; 
	
	//	default 생성자 : 작성 안해도 컴파일러가 생성해줌. 단! 다른 생성자가 없을때만 자동 생성 
	public Student() {}
	
	public Student(int id, String name) {
		this.studentID = id;
		this.studentName = name;
	}
	
	// 메서드
	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	public String  getStudentName() {
		return studentName;
	}

	
	public void setStudentName(String name) {
		studentName = name;
	}
	
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
