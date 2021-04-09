package AbStractionDemos;

public interface InterfaceDemo {

    void start(); // public & abstact
    void run();
    void display();
}

interface AnotherInterface
{
    void display();
}

class  ChildInterface2 implements InterfaceDemo,AnotherInterface
{
    public void run()
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }
    public void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {

        ChildInterface2 ob = new ChildInterface2();
        ob.display();
    }
}
