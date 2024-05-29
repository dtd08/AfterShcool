package oop;

public class MusicPlayerMain2 {
	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
		
		// 음악 플레이어 켜기
		player.onOff();
		
		// 볼륨 증가
		player.volumeUpDown(1);
		
		// 볼륨 증가
		player.volumeUpDown(1);
		
		// 볼륨 감소
		player.volumeUpDown(-1);
		
		// 음악 플레이어 상태
		player.showStatus();
		
		// 음악 플레이어 끄기
		player.onOff();
	}
}
