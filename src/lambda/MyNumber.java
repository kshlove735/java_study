package lambda;

// 람다식을 위한 함수형 인터페이스는 메서드를 하나만 선언해야함
// 컴파일 에러를 막기 위해 아래 어노테이션 선언
@FunctionalInterface
public interface MyNumber {
	int getMaxNumber(int num1, int num2);
}
