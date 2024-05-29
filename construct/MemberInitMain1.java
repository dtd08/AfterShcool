package construct;

public class MemberInitMain1 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit(); // 인스턴스화를 통해 객체 생성
		member1.name = "user1"; // 초기화 과정
		member1.age = 15;
		member1.grade = 90;
		
		MemberInit member2 = new MemberInit(); // 객체 생성
		member1.name = "user2"; // 초기화
		member1.age = 16;
		member1.grade = 80;
		
		MemberInit[] members = {member1, member2};
		for(MemberInit s : members) {
			System.out.printf("이름: %s  나이: %d  성적: %d\n", s.name, s.age, s.grade); // 출력
		}
	}
}
