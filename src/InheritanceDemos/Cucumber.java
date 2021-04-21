package InheritanceDemos;

public class Cucumber {

    Cucumber()
    {
        System.out.println("Cucumber constructor");
    }

    Cucumber(int a)
    {
        System.out.println("Cucumber constructor with parameter");
    }

    int x =10;
    void execute()
    {
        System.out.println("Executing cucumber");
    }

}

class Framework extends Cucumber
{
    Framework(int a)
    {
        super(a); // this will call super class constructor
        System.out.println("framework constructor");
    }


    void execute()
    {
        System.out.println("Executing Framework");
    }

    void displayExecution()
    {
        execute();
        super.execute();
        System.out.println(super.x);
    }

    public static void main(String[] args) {

        Framework framework = new Framework(10);
        framework.displayExecution();
    }
}
