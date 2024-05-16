package poly.ex2;

public class AnimalSoundMain3 {
	public static void main(String[] args) {
		// 인스턴스화 과정과 배열 적재 과정 간소화
		Animal[] animals = {new Dog(), new Cat(), new Cow()};
		
		for(Animal animal : animals) {
			soundAnimal(animal);
		}
	}
	
	public static void soundAnimal(Animal animal) { // 어떤 동물이 들어와도 Animal(부모)로 처리했기 때문에 오류나지 않는다.
		System.out.println("동물 소리 테스트 시작");
		animal.sound(); // 부모의 sound()에 접근하지만 오버라이딩 됐기 때문에 각 동물의 울음소리가 나오게 됨
		System.out.println("동물 소리 테스트 종료\n");
	}
}

/* 
	생길 수 있는 문제 2가지 (실행은 되는데, 치명적인 오류)  
	1. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩 할지 않을 가능성
	   - 매번 오버라이딩 해야하기 때문에 까먹을 수 있다.
	2. Animal 클래스를 생성할 수 있는 문제
	   - Animal 클래스는 실존하지 않는, 실체를 구현하기 위한 클래스이다. 
	   	 하지만 우리는 Animal을 인스턴스화 할 수 있다. 이는 메모리 낭비로 이어지는 쓸모없는 코드가 되어버린다.
*/
 