package AbStractionDemos;

public interface InterfaceDemo2 {

    void start(); // public & abstact
    void run();

    static void run1() // public
    {

    }

    default void run2() // default
    {

    }

}

class ChildInterface implements InterfaceDemo2
{
    public void run()
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo2 ob = new ChildInterface();
        ob.run();
        ob.start();
        ob.run2();
        InterfaceDemo2.run1(); // to access the static member use interface name

    }

}
