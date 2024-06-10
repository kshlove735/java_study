package object;

class Point {
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + ", " +  "y = " + y;
	}
}

class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y , int radius) {
		this.point = new Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점은 " + this.point + "이고, 반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10, 20, 5);
		Circle circleClone = (Circle)circle.clone();
		
		System.out.println(System.identityHashCode(circle));  // 1922154895
		System.out.println(System.identityHashCode(circleClone));  // 883049899
		
		System.out.println(circle.hashCode());  // 1922154895
		System.out.println(circleClone.hashCode());  // 883049899
		
		// 원점은 x = 10, y = 20이고, 반지름은 5입니다.
		System.out.println(circle);
		System.out.println(circleClone);
		
	}

}
