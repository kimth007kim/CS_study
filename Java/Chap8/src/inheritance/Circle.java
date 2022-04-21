package inheritance;

public class Circle {
	
	Point point;	// 합성, 가져다쓰는 관계
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
}
