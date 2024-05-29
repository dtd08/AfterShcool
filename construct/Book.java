package construct;

public class Book {
	String title;
	String author;
	int page;
	
	
	Book(){
		this.title = "";
		this.author = "";
		this.page = 0;
	};
	
	Book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	Book(String title, String author){
		this(title, author, 0);
	}
	
	
	public void displayInfo() {
		System.out.printf("제목: %s, 저자: %s, 페이지: %d\n", this.title, this.author, this.page);
	}
}
