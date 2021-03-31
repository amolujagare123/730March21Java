package ClassesAndConstructors;

public class MyClass {
    int a;
    float f;
    char c;
    String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("f="+f);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.f = 6.4f;
        ob.c = 'n';
        ob.str = "amol";

        ob.display();

        MyClass ob1 = new MyClass();
        ob1.a = 11 ;
        ob1.f = 7.4f;
        ob1.c = '7';
        ob1.str = "sonali";

        ob1.display();

        MyClass ob2 = new MyClass();
        ob2.a = 21 ;
        ob2.f = 70.4f;
        ob2.c = 'k';
        ob2.str = "sunny";

        ob2.display();
    }

}
