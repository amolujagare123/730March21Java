package InheritanceDemos;

public class Animal {

    void eat()
    {
        System.out.println("eat()");
    }

}

class Dog extends Animal
{
    void barks()
    {
        System.out.println("Barks()");
    }
}

class  BabyDog extends  Dog
{
    void weeps()
    {
        System.out.println("weeps()");
    }
}

class TestInheritance
{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.barks();
        dog.eat();

        BabyDog babyDog = new BabyDog();
        babyDog.weeps();
        babyDog.barks();
        babyDog.eat();

    }
}