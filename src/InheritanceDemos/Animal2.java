package InheritanceDemos;

public class Animal2 {

    void eat()
    {
        System.out.println("eat");
    }

}


class Mamal extends Animal
{
    void methodMamal()
    {
        System.out.println("methodMamal");
    }
}

class Reptile extends Animal
{
    void methodReptile()
    {
        System.out.println("methodReptile");
    }

}

class Rabit extends Mamal
{
    void methodRabit()
    {
        System.out.println("methodRabit");
    }
}

class Testinheritance3
{
    public static void main(String[] args) {
        Animal2 ob = new Animal2();
        ob.eat();

        Mamal mamal = new Mamal();
        mamal.eat();
        mamal.methodMamal();

        Reptile reptile = new Reptile();
        reptile.eat();
        reptile.methodReptile();

        Rabit rabit = new Rabit();
        rabit.eat();
        rabit.methodRabit();
        rabit.methodMamal();

    }
}