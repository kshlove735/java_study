package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void whiper();
	
	// 훅 메서드(구현코드 없음. 하위 클래스에서 필요에 의해 재정의해서 쓰는 용도
	public void washCar() {}	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 : 하위 클래스에서 재정의 X
	public final void run() {
		startCar();
		drive();
		whiper();
		stop();
		washCar(); // 필요에 의해서 재정의
		turnOff();
	}
}
