package pack;

import pack.a.User;

public class PackageMain2 {
	public static void main(String[] args) {
		Data data = new Data(); // 같은 패키지여서 문제 없음
		// User user = new User(); // import 없이 작성 -> 다른 패키지여서 문제 발생 -> 경로를 써주거나 import 해줌
		// pack.a.User user = new pack.a.User(); // 굳이 이렇게 하기 귀찮음 -> import
		// User user = new User();
		
		// a 패키지 안에도 b 패키지 안에도 User가 있음
		// 이름이 같으면 동시에 import 할 수 없기 때문에 많이 쓰는걸 import 해줌
		User userA = new User();
		pack.b.User userB = new pack.b.User();
		
	}
}
