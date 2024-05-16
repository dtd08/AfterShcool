package poly.ex2;

public class AnimalSoundMain2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		Animal animals[] = {dog, cat, cow};
		
		for(Animal a : animals) {
			System.out.println("동물 소리 테스트 시작");
			a.sound(); 
			System.out.println("동물 소리 테스트 종료\n");
		}
	}
}