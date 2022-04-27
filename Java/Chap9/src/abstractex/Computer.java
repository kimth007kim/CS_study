package abstractex;

public abstract class Computer {		
	public abstract void display();		//구현을 안하겠다라는이야기 선언만 하겠다.
	public abstract void typing();		// 구현코드가 없으면 추상메서드가 된다.
 
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}	
