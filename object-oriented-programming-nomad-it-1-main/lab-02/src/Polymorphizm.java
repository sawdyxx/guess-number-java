abstract class Animal {

    protected String name;
    protected int age;
    protected double weight;


    public abstract void makeSound();

    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super.name = name;
        super.age = age;
        super.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makeSound");
    }

    // динамичный полиморфизм
    @Override
    public void eat() {
        System.out.println("Dog eat...");
    }
}

class Cat extends Animal {

    public Cat(String name, int age, double weight) {
        super.name = name;
        super.age = age;
        super.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat...");
    }

    public void example(){
        System.out.println("Cat example");
    }

    public void example(String str){
        System.out.println("Cat example");
    }

}

public class Polymorphizm {

    public static void main(String[] args) {
        Animal animal = new Dog("Undefined", 12, 100.0);
        Animal animal2 = new Cat("Undefined", 12, 100.0);

        animal.eat();
    }



}
