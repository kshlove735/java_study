package genericex;

public class Plastic extends Material{
	
	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Plastic 출력 중");
	}
}
