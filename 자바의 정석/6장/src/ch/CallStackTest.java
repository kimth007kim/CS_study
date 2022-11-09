package ch;

public class CallStackTest {
    public static void main(String[] args) {
        
        System.out.println("main(String[] args)이 시작됨");
        firstMethod();
        System.out.println("main(String[] args)이 끝남");
    }
    static void firstMethod(){
        System.out.println("firstMethod()이 시작됨");
        secondMethod();
        System.out.println("firstMethod()이 끝났음");
    }
    static void secondMethod(){
        System.out.println("secondMethod() 시작됨");
        System.out.println("secondMethod() 끝났음");
    }
}
