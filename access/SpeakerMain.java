package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		// 필드에 직접 접근
		System.out.println("volume 필드 직접 접근 수정");
		speaker.volume = 200;
		speaker.showVolume();
		
		// 때문에 private를 통해 중요성을 강조하기도 함 
	}
}
