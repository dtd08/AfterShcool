package poly.ex.sender;

public class SendMain {
	public static void main(String[] args) {
		Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
		
		// 하나의 메세지를 다중 매체로 전송
		for(Sender sender : senders) {
			sender.sendMessage("환영합니다!");
		}
	}
}

/* 
	다중 메세지 발송
	- 한 번에 여러 곳에 메세지를 발송하는 프로그램을 개발하자.
	- 메인 코드를 보고 클래스를 완성하시오.
	
	요구사항
	1. 다형성을 활용해야 한다.
	2. Sender 인터페이스를 구현하고 사용해야 한다.
	3. EmailSender.java, SmsSender.java, FaceBook.java를 구현하세요.
	
	실행결과
	메일을 발송합니다: 환영합니다!
	SMS을 발송합니다: 환영합니다!
	페이스북에 발송합니다: 환영합니다!
*/