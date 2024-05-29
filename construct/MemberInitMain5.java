package construct;

public class MemberInitMain5 {
	public static void main(String[] args) {
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // 인스턴스화를 통해 객체 생성 및 초기화
		MemberConstruct member2 = new MemberConstruct("user2", 16); // 오버로딩한 생성자 활용
		
		MemberConstruct[] members = {member1, member2};
		for(MemberConstruct s : members) {
			System.out.printf("이름: %s  나이: %d  성적: %d\n", s.name, s.age, s.grade); // 출력
		}	
	}
}
