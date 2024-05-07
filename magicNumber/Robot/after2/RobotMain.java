package magicNumber.after2;

public class RobotMain {
	public static void main(String[] args) {
		Robot robot = new Robot("Smith");
		
		robot.order(Robot.Command.WALK);
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
		
		// robot.order(100); enum을 쓰게 되면 더 이상 숫자 값을 넘기지 못한다.
		// 만약 문자열을 쓴다면 잘못 넘어갈 가능성도 있고, 데이터가 커지게 되며 처리가 힘들다.
		// 하지만 enum을 쓴다면 정의된 값만 쓸 수 있고, 데이터를 잘못 넘길 수 없기 때문에 좋다.
		// 또한 상수를 쓰면 교체가 되지 않기 때문에 중복된 값을 쓰기 쉽고, 단어 자체를 가져다 쓰는 것이기 때문에 코드를 알기 쉽다.
	}
}
