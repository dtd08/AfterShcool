package poly.ex.sender;

public class SmsSender implements Sender{
	@Override
	public void sendMessage(String message) {
		System.out.println("페이스북에 발송합니다: " + message);
	}
}
