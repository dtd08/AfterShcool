package extends1.ex;

public class Item {
	private String name; // 상품명
	private int price; // 가격
	
	Item(String name, int price) { // 공통된 속성 초기화 -> 자식들의 생성자에서 굳이 이 코드를 쓸 필요 없음
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() { // price(공통된 속성) 받기 -> 부모 클래스에서 씀 -> 중복 제거 
		return price;
	}
	
	public void print() { // 공통된 속성 출력 -> 자식 클래스에서 추가해서 쓰면 됨(오버라이딩)
		System.out.printf("이름: %s, 가격: %d\n", name, price);
	}
}
