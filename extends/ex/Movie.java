package extends1.ex;

public class Movie extends Item{
	private String director; // 감독
	private String actor; // 배우
	
	Movie(String name, int price, String director, String actor) {
		super(name, price); // 부모의 생성자로 초기화
		this.director = director;
		this.actor = actor;
	}
	
	@Override
	public void print() { // 오버라이드
		super.print(); // 부모의 print() 선 출력
		System.out.printf("-감독: %s, 배우: %s\n", this.director, this.actor); // 자식만의 출력문구
	}
}
