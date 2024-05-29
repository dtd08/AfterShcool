package oop;

public class MusicPlayer {
	boolean isOn;
	int volume = 1;
	
	// 음악 플레이어 키고 끄기
	public void onOff() {
		if(isOn) {
			System.out.println("음악 플레이어를 시작합니다.");
			isOn = false;
		}
		else {
			System.out.println("음악 플레이어를 종료합니다.");
			isOn = true;
		}
	}
	
	// 볼륨 증감
	public void volumeUpDown(int pm) {
		if(pm == 1) volume++;
		else if(pm == -1) volume--;
		System.out.println("현재 볼륨 : " + volume);
	}
	
	// 음악 플레이어 상태 확인
	public void showStatus() {
		if(isOn) System.out.println("음악 플레이어는 ON, 볼륨 : " + volume);
		else System.out.println("음악 플레이어는 OFF");
	}
}
