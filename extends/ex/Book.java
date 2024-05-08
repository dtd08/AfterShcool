package extends1.ex;

public class Book extends Item {
	private String author; // 저자
	private String isbn; // 고유번호
	
	public Book(String name, int price, String author, String isbn) {
		super(name, price); // 부모 생성자로 값 초기화
		this.author = author; // 자식 생성자로 값 초기화
		this.isbn = isbn;
	}
	
	@Override
	public void print() { // 오버라이드한 메소드
		super.print(); // 부모의 print 선 출력
		System.out.printf("-저자: %s, isbn: %s\n", this.author, this.isbn); // 자식 클래스만의 출력문구
	}
}
