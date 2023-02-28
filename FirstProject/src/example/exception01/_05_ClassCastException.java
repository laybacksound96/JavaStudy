package example.exception01;
class Animal { }
class Dog extends Animal {};

class Cat extends Animal {
};
public class _05_ClassCastException {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal ani = dog;
        Dog dog1 = (Dog) ani;

    }
}
