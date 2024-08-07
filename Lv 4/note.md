java.lang 패키지
- 자바가 기본으로 제공하는 라이브러리(클래스 모음) 중에 가장 기본이 되는 것
- 자바 언어를 이루는 가장 기본이 되는 클래스를 보관하는 패키지


java.lang 패키지의 대표적인 클래스들
1. Object : 모든 자바 객체의 부모 클래스
2. String : 문자열
3. Integer, long, double : 랩퍼 타입(클래스), 기본형 데이터 타입을 객체로 만든 것
4. Class : 클래스들의 메타 정보
5. System : 시스템과 관련된 기본 기능들을 제공
- 위의 클래스들은 자바 언어의 기본을 다루기 때문에 반드시 알고 넘어가야 함


import 생략 가능 (기본적인 것들이기에)
- java.lang 패키지는 모든 자바 애플리케이션에 자동으로 임포트 됨
- 임포트 부분 사용하지 않아도 됨


object 클래스
- 자바에서 모든 클래스의 최상위 부모 클래스는 항상 object 클래스이다


자바에서 Object 클래스가 최상위 부모 클래스인 이유

 1. 공통 기능 제공
   - 객체에 정보를 제공하고, 이 객체가 다른 객체와 같은지 비교하고, 
     객체가 어떤 클래스로 만들어졌는지 확인하는 기능은 모든 객체가 필요로 하는 기능이다. 
     이런 기능을 객체를 만들 때마다 항상 새로운 메서드를 정의해서 만들어야한다면 상당히 번거로울 것이다.
   - 막상 만든다고 해도 개발자마다 서로 다른 이름의 메서드를 만들어서 일관성 없어짐
   - 개발자는 모든 객체가 앞서 설명한 메서드를 지원한다는 것을 알고 있다. 따라서 프로그래밍이 단순화되고, 일관성을 갖게 된다.
2. 다형성의 기본 구현
   - 부모는 자식을 담을 수 있다. Object는 모든 클래스의 부모 클래스이다. 따라서 모든 객체를 참조할 수 있다.
   - 모든 자바 객체는 Object 타입으로 처리할 수 있으며, 이는 다양한 타입의 객체를 통합적으로 관리할 수 있다.
   - Object는 모든 객체를 담을 수 있기에 타입이 다른 객체들을 어딘가에 보관해야 한다면 Object에 보관하면 된다.


Object 다형성
- Object 클래스는 모든 클래스의 부모 클래스이다. 따라서 Object 클래스는 모든 객체를 참조할 수 있다.


Object를 활용한 다형성의 한계
- Object는 모든 객체를 대상을 다형적 참조를 할 수 있다.
    - 즉, Object는 모든 객체의 부모이므로 모든 객체를 담을 수 있다.
- Object를 통해 전달 받은 객체를 호출하려면 각 객체에 맞는 다운캐스팅 과정이 필요하다.
    - Object가 세상의 모든 메서드를 알고 있는 것이 아니다.
    - 다운캐스팅을 하기 쉽지 않다는 말

    다형성을 제대로 활용하려면 다형적 참조 + 메서드 오버라이딩을 함께 사용해야 한다.
    Object는 모든 객체의 부모이므로 모든 객체를 대상으로 다형적 참조를 할 수 있다.
    하지만 Object에는 Dogsound(), Car.move()와 같은 다른 객체의 메서드가 정의되어 있지 않다.
    따라서 메서드 오버라이딩을 활용할 수 없다.
    결국 각 객체의 기능을 호출하려면 다운캐스팅을 해야한다.

    결론
    : 다형적 참조는 가능하지만, 메서드 오버라이딩이 안되기 때문에 다형성을 활용하기에 한계가 있다!


한계점 극복을 위한 방법
Object 배열
    - Object[]을 만들면 세상의 모든 객체를 담을 수 있는 배열을 생성할 수 있다.


Object가 없다면?
1. void action(Object obj)와 같이 모든 객체를 받을 수 있는 메서드는 만들 수 없다.
2. Object[] objects 처럼 모든 객체를 저장할 수 있는 배열을 만들 수 없다.
3. MyObject 같은 클래스를 만들고 모든 클래스에서 직접 정의한 MyObject를 상속 받으면 해당 기능을 구현할 수 있지만,
   하나의 프로젝트를 넘어 전세계 모든 개발자가 비슷한 클래스를 만들것이고,
   서로 호환되지 않는 수많은 xxxObject들이 넘처날 것이다.
