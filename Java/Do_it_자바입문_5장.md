04/13 
클래스 와 객체

클래스를 생성하는 방법

클래스형 변수이름 = new 생성자;

변수는 크게 두가지
참조형 데이터 타입= Student, 생성한 객체
기본 데이터 타입 = int,char,boolean,double

stack 메모리는 지역 변수들이 자리를 잡는곳이다. 

Stack 에는 int,char,boolean,double Object 데이터의 참조값ex) kim,lee등이 할당된다.
원시 타입의 데이터들은 실제 값을 저장한다.
함수가 호출될때 사용하는 메모리이고 기능 수행이 끝나면 자동으로 반환한다.

heap 메모리는 인스턴스들이 자리를 잡는곳이다.
Heap 에는 String, Integer 같은 Object 메모리가 할당된다.(어플리케이션의 모든 메모리 중에 stack을 제외한 부분이다,)
지역변수는 블록 안에 형성된것이 지역변수이다.

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.studentName="경동";
		kim.studentID=1;
		kim.address="서울시 영동포구";
	
		Student lee = new Student();
		lee.studentName="장군";
		lee.studentID=2;
		lee.address="경기도 안산";
		
		kim.showStudentInfo();
		lee.showStudentInfo();

	}

}
해당 코드에서 kim, lee 는 지역변수이다.
힙메모리는 동적으로 생성되는 메모리이다.( 필요하면 할당받는다.) kim 과 lee의 주소값이 들어간다.
kim의 name,id,address,grade 가

stack 메모리는 함수가 리턴되면 자동으로 사라진다.
heap 메모리는 가비지 콜렉터가 없애준다.

따라서 kim이나 lee를 System.out.println(kim); 하게되면 패키지명.클래스명@주소값이 출력되는것이었다!
힙메모리에 생성된 주소값을 출력하는것이었다. 따라서 참조변수라고 부른다. 그리고 주소를 참조값이라고 부른다.

생성자는 클래스에 하나도 없는경우에는 자바 컴파일러에서 알아서 추가해준다.

기본생성자는 생성자가 하나도없으면 자동으로 생긴다.
생성자는 언제 사용하냐면, 처음 객체를 생성하면서 해야되는 일들 하고싶은일들 을 생성자에 등록을 해준다.
ex) 이 객체가 생성될때 이름은 가지고 시작을 해야한다, 이 객체가 생성될때 id 값은 가지고 있어야한다 등등

생성자 기본문법
modifer class_name (매개변수 목록)
{
    
}

정보 은닉 OOP에서 가장 큰 특징 중에 하나이다. 객체에 속성을 숨기는것이다. 이때 사용하는 접근제어자가
private 접근 제어자이다.

private로 쓰는 이유는 무결성(데이터에 아무값이나 들어가면 안되는 경우에) public 메서드로 값을 변경하려고 쓰거나, readonly로 쓰기위해서(Getter만 열어두면된다) 사용한다.

public은 외부클래스에서 access가능
private은 같은 클래스 내에서 access가능
default은 같은 패키지 내에서 access가능