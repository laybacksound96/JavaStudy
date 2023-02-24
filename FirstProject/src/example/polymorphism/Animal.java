package example.polymorphism;

public class Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
    }
}

class ParentAnimal {
    void breathe() {
        System.out.println("숨소리"
        );
    }
    void sound() {
          
    }
}

class Dog extends ParentAnimal {
    void sound() {
        System.out.println("멍");
    }
}

class Cat extends ParentAnimal {
    void sound() {
        System.out.println("냥");
    }
}