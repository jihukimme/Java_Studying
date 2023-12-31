# Java_Studying

Java studying in KMU

---

## 1. Java란..?

자바는 C언어에 객체 지향적 기능을 추가하여 만든 C++과 달리, 처음부터 객체 지향 언어로 개발된 프로그래밍 언어이다. 자바는 자바 가상 머신(JVM, Java Virtual Machine)을 사용하여 운영체제와 독립적으로 동작할 수 있다.

따라서 자바는 어느 운영체제에서나 같은 형태로 실행 될 수 있다.

## 2. Java의 특징

- 자바는 객체지향 언어이다.
  - 객체를 만들기 위해서 설계도인 클래스를 작성하고, 객체와 객체를 연결하여 목적에 맞는 프로그램을 만든다.
  - 객체지향 언어의 특징인 캡슐화, 상속성, 다형성을 완벽하게 지원한다.
- 이식성이 높다
  - 자바 실행환경이 설치되어 있는 모든 운영체제에서 실행 가능하다.
- 하이브리드 언어이다.
  - 컴파일 언어인 동시에 인터프리터 언어이다.
  - 텍스트 소스를 컴파일하여 이진 파일(class)파일로 만든 다음 자바 런타임이 클래스 파일을 인터프리트 하면서 실행한다.
  - 시스템에 무관한 이진 파일을 만듦으로써 자바는 컴파일 언어에 가까운 속도와 시스템 독립성을 얻을 수 있다.
- 메모리를 자동으로 관리한다.
  - 개발자가 직접 메모리에 접근할 수 없으면 자바가 직접 메모리를 관리한다.
  - 객체 생성시 자동으로 메모리 영역을 찾아 할당하고, 가비지 콜렉터(Garbage Collector)를 실행시켜 자동으로 사용하지 않는 객체를 제거한다.
  - 개발자는 메모리 관리의 수고를 덜고, 핵심기능 코딩에 집중할 수 있다.
- 오픈소스 라이브러리가 풍부하다.
  - 자바는 오픈소스 언어이고 자바 프로그램에서 사용하는 라이브러리 또한 오픈소스의 양이 방대하다.
  - 고급 기능을 구현하는 코드를 작성하는 대신 검증된 오픈소스 라이브러리를 사용하면 애플리케이션을 다시 컴파일 할 필요가 없다.
- 자바는 실행을 위해 자바 가상 머신을 거쳐야하므로, 다른 언어에 비해 실행 속도가 느리다.
- 자바는 예외 처리가 잘 되어있지만, 개발자가 일일이 처리를 지정해 줘야한다는 불편함이 있다.
- 자바는 다른 언어에 비해 작성해야 하는 코드의 길이가 긴 편이다.

---

### 2.1. 객체지향 언어란..?

> 객체지향언어란, 프로그램을 데이터와 처리방법으로 나누지 않고, 객체를 만들고 조작하며 객체끼리 관계를 맺음으로써 다수의 객체가 서로 상호작용할 수 있게 하는 것이다. 다시 말해, 객체를 조립해서 전체의 프로그램을 만드는 조립식 프로그래밍이다.

### 2.1.1. 객체(Object)란?

> 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신과 다른 것을 식별가능한 것을 말한다. 예를 들어, 물리적으로 존재하는 학생, 회원 등과 추상적으로 생각할 수 있는 생산, 주문, 배송 등이 모두 객체가 될 수 있다.

### 2.1.2. 클래스(Class)란?

> 객체라는 추상적인 개념을 코드화 한 것을 클래스라고 한다. 간단하게 생각하면, 클래스는 붕어빵틀 그리고 객체는 붕어빵 정도로 생각하면 좋다. 이처럼 객체를 만들기 위한 설계도 개념인 클래스는 객체의 속성과 기능을 표현하는 변수가 메소드를 포함한다.

### 2.2.1. 객체지향언어 장점

> 1. 재사용성
> 2. 신뢰성 향상
> 3. 유지보수의 우수성

### 2.2.2. 객체지향언어 단점

> 1. 개발속도가 느림
> 2. 실행속도가 느림

---

👉 상태: 멤버변수

클래스 안에서 선언되는 변수를 멤버 변수라고 하며 객체가 가지는 속성을 표현하는데 사용된다.

👉 동작: 메소드

메소드는 객체 안에서 사용하는 함수로 객체가 제공하는 기능을 구현하는데 사용된다.

👉 멤버변수와 메소드 예시

멤버변수와 메소드를 각각 클래스의 상태와 동작의 역할이라고 생각하면 이해하기 쉽다. 예를 들어, 고양이라는 클래스가 있다고 가정해보자. 고양이를 이루는 여러가지 요소를 크게 나누면 상태(속성)와 동작으로 나눌 수 있다. 고양이의 상태로는 생김새나 이름 몸무게 등이 있다. 반대로 고양이의 동작은 할퀴기나 핡기 그리고 밥먹기 등이 있다. 이런 상태와 동작을 각각 메소드와 클래스로 표현하면 아래와 같이 표현된다.

```java
  Class cat {

  String name = 'kitty';
  int weight = 10 ;

  void claw() { }

  }

  Class cat1 = new Cat();

```

---

### 3.1. 패키지 (Package)

> 패키지: 서로 관련있는 클래스나 인터페이스의 컴파일 된 클래스(.class) 파일들을 서로 관련있는 것들끼리 한곳에 묶어 놓은 것

- 하나의 패키지: 하나의 디렉터리에 저장된 클래스 파일들을 지칭
- 클래스를 지칭할 때는 패키지명을 포함하는 경로명을 사용
  - ex) java.awt.Color: 클래스의 이름(경로명)/java.awt:패키지명

> import문: 다른 패키지의 클래스를 사용할 때, 컴파일러에게 그 클래스의 경로명을 알려주는 문

- import 패키지;

### 3.2. 모듈 (Module)

> 모듈: 패키지들을 담는 컨테이너로 모듈파일(.jmod)로 저장

- 자바 JDK 패키지
  - java.lang: 문자열, 수학함수, 입출력
  - java.util: 날짜, 시간, 벡터, 해시맵
  - java.io: 키보드, 모니터, 프린터, 파일
  - java.awt와 javax.swing: GUI프로그래밍
