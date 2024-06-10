package object;

class Student{
	int stuedentID;
	String studentName;
	
	public Student(int studentID, String studentName){
		this.stuedentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(stuedentID == std.stuedentID) 
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return stuedentID;
	}
	
	
	
	
}
public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		// 재정의 되어 있어서 hashCode() 값이 같음
		System.out.println(str1.hashCode());  // 3556498
		System.out.println(str2.hashCode());  // 3556498

		
		Student std1 = new Student(1, "홍길동");
		Student std2 = new Student(1, "홍길동");
		
		// 재정의 후 : 1로 동일
		System.out.println(std1.hashCode());  // 재정의 전 : 495053715
		System.out.println(std2.hashCode());  // 재정의 전 : 1922154895

	}

}
