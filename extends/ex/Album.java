package extends1.ex;

public class Album extends Item{
	private String artist;
	
	Album(String name, int price, String artist) {
		super(name, price); // 부모의 생성자로 초기화
		this.artist = artist;
	}
	
	@Override
	public void print() { // 오버라이드
		super.print(); // 부모의 print() 선 출력
		System.out.printf("-아티스트: %s\n", this.artist); // 자식만의 출력문구
	}
}
