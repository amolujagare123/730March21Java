package InheritanceDemos;

public class BaseClass {
    int a;
    double d;
    void method1()
    {
        System.out.println("this is method 1");
    }
}

class DerivedClass extends BaseClass
{
    char c;
    String str;
    void method2()
    {
        System.out.println("this is method 2");
    }

    public static void main(String[] args) {
        DerivedClass ob = new DerivedClass();
        ob.c = 'g';
        ob.str ="amol";
        ob.method2();

        ob.a = 10;
        ob.d = 2.3;
        ob.method1();
    }
}
