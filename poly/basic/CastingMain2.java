package poly.basic;

public class CastingMain2 {
	public static void main(String[] args) {
		Parent poly = new Parent();
		
		// poly.childMethod();
		
		// 다운캐스팅(부모타입 -> 자식타입)
		// poly 자체는 여전히 Parent 타입이지만 값만 일시적으로 Child가 된 것임
		// 단순한 호출을 할 때만 이렇게 씀
		((Child)poly).childMethod(); // .이 우선순위를 갖기 때문에 형변환이 늦게 됨 -> 형변환 먼저
	}
}
