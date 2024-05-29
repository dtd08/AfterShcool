package construct;

public class MemberInitMain4 {
	public static void main(String[] args) {
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // 인스턴스화를 통해 객체 생성 및 초기화
		MemberConstruct member2 = new MemberConstruct("user2", 16, 80); // 객체 생성 및 초기화
		
		MemberConstruct[] members = {member1, member2};
		for(MemberConstruct s : members) {
			System.out.printf("이름: %s  나이: %d  성적: %d\n", s.name, s.age, s.grade); // 출력
		}	
	}
}
