package construct;

public class MemberInitMain3 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit(); // 인스턴스화를 통해 객체 생성
		// 메소드를 이용한 초기화1
		member1.initMember("user1", 15, 90);
		
		MemberInit member2 = new MemberInit(); // 객체 생성
		// 메소드를 이용한 초기화2
		member2.initMember("user2", 16, 80);
		
		MemberInit[] members = {member1, member2};
		for(MemberInit s : members) {
			System.out.printf("이름: %s  나이: %d  성적: %d\n", s.name, s.age, s.grade); // 출력
		}	
	}
}
