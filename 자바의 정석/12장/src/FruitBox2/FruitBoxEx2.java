package FruitBox2;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable{}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }


    public String toString() {
        return list.toString();
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//        FruitBox<Grape> grapeBox1 = new FruitBox<Apple>(); // 에러 타입 불일치
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 와일드 카드에 해당하는 클래스를 상속받지 않아서 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
//        fruitBox.add(new FruitBoxEx1.Toy());

//        appleBox.add(new Grape());    Grape는 Apple의 자손이 아님
        appleBox.add(new Apple());
        grapeBox.add(new Grape());


        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);


    }
}
