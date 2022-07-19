 12장 제너릭 프로그래밍
 
 
 - 제네릭 프레임 워크
   
   하나의 자료형에 국한되지않고 여러 자료형으로 변환 될수 있도록 프로그래밍 하는 방식
   실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식이다.
   

   
- 제너릭 클래스 정의하기

  여러 참조 자료형으로 대체될수 있는 부분을 하나의 문자로 표현
  
  public class GenericPrinter<T>{  // 제너릭 클래스 T는 type의 약자 자료형 매개변수

    }                              // T는 인스턴스 생성과 상관없이 메모리를 잡는다. static 을 사용할수 없다.
  컴파일러가 나중에 캐스팅 작업을 해준다.
  
- 제너릭 클래스의 매개변수의 자료형을 명시하지 않을 경우

   Object로 간주한다. 형변환해야한다. ArrayList도 동일하다.


- <T extends 클래스>
 
  T가 사용될 클래스를 제한하기 위해서 사용한다. 
  
  
- 컬렉션 프레임워크(자료구조)
    
   - Array: 같은 형의 데이터 타입을 메모리에 저장하는 선형적 자료구조
   - LinkedList
   
   
- ArrayList 와 Vector 
   
   - Vector 는 동기화를 지원해준다. 단일 스레드일때도 그일 을 한다. 웹프로그래밍에서는 웹서버가 스레드 처리를 다해주기때문에 스레드를 처리할필요가없다.
   - 일반적으로 ArrayList를 더 많이 사용한다. 
   - ArrayList에 동기화 기능이 추가되어야 할 경우에는 
   Collections.synchronizedList(new ArrayList<String()); 이렇게 사용한다.
   
   
- Set 인터페이스

    Collections 하위의 인터페이스
    중복을 허용하지 않음
    아이디,주민번호,사번등 유일한 값이 객체를 관리할때 사용
    List는 순서 기반의 인터페이스, Set은 순서 없음
    get(i) 메서드 제공x
    
    
- TreeSet 클래스
    
    Tree 가 붙으면 정렬을 하기위한 것
    중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체 정렬
    내부적으로 이진 검색트리로 구현
    이진 검색트리에 자료가 저장할때 비교하여 저장할 위치를 정함
    객체 비교를 위해 Comparable이나 Comparator를 구현해야한다.
    
    
- Comparable 인터페이스와 Comparaator 인터페이스

    정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
    Comparable 은 CompareTo() 메서드를 구현
        매개변수와 자기자신(this ) 비교
        
    Comparator는 compare() 메서드를 구현
        두개의 매개변수를 구현 (자신은 첫번째 매개변수)
        
    TreeSet 생성자에 Comparator가 구현된 객체를 매개변수로 전달
    
    TreeSet<Member> treeSet = new TreeSet<Member>(new Member());
    
    일반적으로 Comparable을 더많이 씀
    
- Map 인터페이스
    
    key-value pair의 객체를 관리하는데 필요한 메서드 정의
    key는 중복될수 없음
    검색을 위한 자료구조
    key를 이용하여 값을 저장하거나 검색,삭제 할때 사용하면 편리함
    내부적으로 hash방식으로 구현됨
    key가되는 객체의 유일성함의 여부를 알기 위해 equals()와 hashCode()메서드를 재정의함
    
    