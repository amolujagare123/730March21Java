package AbStractionDemos;

public abstract class MyAbstractClass {

    abstract void run();

    abstract void start();

    void show()
    {
        System.out.println("show");
    }

}

class ChildAbstract extends MyAbstractClass
{
    void run()
    {
        System.out.println("run");
    }
    void start()
    {
        System.out.println("start");
    }

}
