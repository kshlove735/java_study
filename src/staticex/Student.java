package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;

	public Student(){
		serialNum++;
		this.studentID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}
}
