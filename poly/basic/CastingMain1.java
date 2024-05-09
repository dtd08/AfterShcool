package poly.basic;

public class CastingMain1 {
	public static void main(String[] args) {
		Parent poly = new Parent();
		
		// poly.childMethod();
		
		// 다운캐스팅(부모타입 -> 자식타입)
		// poly 자체는 여전히 Parent 타입이지만 값만 일시적으로 Child가 된 것임
		Child child = (Child)poly;
		child.childMethod();
	}
}
