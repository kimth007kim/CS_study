package ch;
class MemberCall{
    int iv= 10;
    static int cv= 20;
    int iv2= cv;
//    static int cv2=iv; 에러 클래스 변수는 인스턴스 변수를 사용할수 없음
    static int cv2 = new MemberCall().iv;

    static void staticMethod1(){
        System.out.println(cv);
//        System.out.println(iv); 에러.클래스 메서드에서 인스턴스 변수를 사용불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    static void staticMethod2(){
       staticMethod1();
//       instanceMethod1(); 에러. 클래스 메서드에서는 인스턴스 메서드를 호출할수없음
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할수 있음
    }
    void instanceMethod1(){ //인스턴스 메서드에서는 인스턴스메서드,클래스메서드 모두 인스턴스 생성없이 호출가능
        staticMethod1();        
        instanceMethod1();
    }
}

