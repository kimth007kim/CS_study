package thisex;


class Person{
	String name;
	int age;
	
	public Person() {
//		int i=0; 
//		생성자에서 생성자 호출할때는 다른 생성자 앞에 어떠한 것도 올수없다.
		this("이름없음",1);
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
	}

}
