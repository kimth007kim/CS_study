11장 기본 클래스

java.lang 패키지 

프로그래밍시 import 하지않아도 자동으로 import 됨
import java.lang.*; 문장이 컴파일할때 자동으로 추가됨

String,Integer,System 등등

- Object 클래스

 자바의 모든 클래스의 최상위 클래스
 모든 클래스는 Object 클래스에서 상속받음
 모든 클래스는 Object 클래스의 메서드를 사용가능하다.
 모든 클래스는 Object 클래스의 메서드 중 일부는 재정의 할 수 있음(final 로 선언된 메서드는 재정의 x)
 
 컴파일러가 extends Object 를 자동으로 추가한다.
 
- toString()메서드

클래스이름.해시코드값(힙메모리에 생성된 주소값)

객체의 정보를 String 으로 바꿀때 많이 쓰임

- equals() 메서드 

 두개의 인스턴스가 같다라고 하려면  같은메모리이어야 한다. 물리적으로 주소값이 같아야한다.
 두 인스턴스의 주소값을 비교해서 true/false를 반환
 
 보통은 == 과 같지만 String의 경우에는 주소값을 비교하지않고 문자열이같은지 비교한다.
 
 논리적인 동일성을 구현할때 사용한다.
 
 - hashCode() 메서드
 
 hash : 정보를 저장하기 위한 자료구조
 키값만 알면 저장된 위치를 금방 찾을수 있다.
 hashCode() 메서드는 인스턴스의 저장 주소를 반환한다.
 
 논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면, hashCode() 메서드로 재정의하여 동일한 값이 반환되도록함
 
 String 클래스 : 동일한 문자열 인스턴스에 대해 동일한 정수 반환
 Integer 클래스: 동일한 정수값의 인스턴스에 대해 동일한 정수 반환
 
 - Clone() 메서드
 
 객체의 원본을 복제하려고 사용하는 매소드
 clone()  메서드를 사용할떄 clonable 인터페이스를 상속해야한다.
 
 
 - String 클래스
 
  C언어에서 문자열 쓰려면 Char array 사용해야한다.
  이점에서는 자바가 이점
  
  String 선언하는 방법
   String str1 = new String("abc");  // 생성자의 매개변수로 문자열 생성 새로운 주소에 할당
   String str2 = "test";        //문자열 상수를 가리키는 방식
   
   
 - String 클래스로 문자열 연결
 
 한번 생성된 String값 문자열은 불변
 두개의 문자열을 연결하면 새로운 인스턴스가 생성됨
 문자열을 계속해서 연결하면 메모리에 garbage 가 많이 생길수 있음
 
 
 - StringBuilder, StringBuffer 사용하기
  내부적으로 가변적인 char[] 배열을 가지고있는 클래스
  문자열을 여러번연결하거나 변경할때 사용하면 유용함
  StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화 보장
  단일 쓰레드에서는 StringBuilder를 사용하기를 권장
  toString() 메서드로 String 변환