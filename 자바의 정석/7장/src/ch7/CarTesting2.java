package ch7;

public class CarTesting2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;


        car.drive();
//        fe= (FireEngine) car;// 컴파일 OK 실행시 에러 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
