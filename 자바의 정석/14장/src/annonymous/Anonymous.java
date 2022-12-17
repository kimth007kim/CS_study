package annonymous;


class Insect {
    void attack() {
        System.out.println("곤충은 공격을 한다.");
    }

}

public class Anonymous {
    Insect spider1 = new Insect() {
        String name = "무당거미";

        void cobweb() {
            System.out.println("사각형으로 거미줄을 친다.");
        }

        void attack() {

            System.out.println(name + " 독을 발사한다.");
        }

    };

    //로컬 변수의 초기값으로 대입
    void method1() {
        Insect spider1 = new Insect() {
            String name = "늑대거미";

            void cobweb() {
                System.out.println("육각형으로 거미줄을 친다.");
            }

            void attack() {
                System.out.println(name + " 앞니로 공격 한다.");
            }
        };
    }

    void method2(Insect spider){
        spider.attack();
    }
}
