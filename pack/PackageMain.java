package pack;

import pack.a.User;

public class PackageMain {
	public static void main(String[] args) {
		Data data = new Data(); // 같은 패키지여서 문제 없음
		// User user = new User(); // import 없이 작성 -> 다른 패키지여서 문제 발생 -> 경로를 써주거나 import 해줌
		// pack.a.User user = new pack.a.User(); // 굳이 이렇게 하기 귀찮음 -> import
		User user = new User();
	}
}
