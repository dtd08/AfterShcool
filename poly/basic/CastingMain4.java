package poly.basic;

public class CastingMain4 {
	
	// 다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다.
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child)parent1;
		child1.childMethod();
		
		Parent parent2 = new Parent(); // 부모만 생성됐는데 자식을 찾으려니 없음 => 오류
		Child child2 = (Child)parent2; // 문법상에는 문제가 없지만 메모리 공간엔 없어서 오류가 남
		child2.childMethod();
	}
}
