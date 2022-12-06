package FruitBoxEx1;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "FruitBoxEx1.Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "FruitBoxEx1.Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "FruitBoxEx1.Grape";
    }
}

class Toy {
    public String toString() {
        return "FruitBoxEx1.Toy";
    }
}

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

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//        FruitBoxEx1.Box<FruitBoxEx1.Apple> grapeBox = new FruitBoxEx1.Box<FruitBoxEx1.Grape>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
//        fruitBox.add(new FruitBoxEx1.Toy());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);


    }
}
