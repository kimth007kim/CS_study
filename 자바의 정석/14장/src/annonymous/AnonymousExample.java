package annonymous;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();

        a.spider1.attack();
        a.method1();

        a.method2(new Insect(){
            String name ="타란튤라";

            void cobweb() {
                System.out.println("그냥 마구잡이로 친다.");
            }

            void attack() {
                System.out.println(name + "공격 안하고 후퇴한다.");
            }
        });
//        a.spider1.name="왕거미";
//        a.spider1.coweb();
//        a.spider1.attack();

    }
}
