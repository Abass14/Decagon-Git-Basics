class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move() {
        super.move();
        System.out.println("Dogs can run");
    }

    public void bark() {
        System.out.println("dogs can bark");
    }
}

public class TestDog {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Animal b = new Dog();

        // a.move();
        b.move();
    }
}
