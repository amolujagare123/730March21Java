package ClassesAndConstructors;

public class MyClassDemo2 {
    int a;
    float f;
    char c;
    String str; // data members

    MyClassDemo2()
    {
        // no body - empty constructor
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("f="+f);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }
    public static void main(String[] args) {
        MyClassDemo2 ob  =new MyClassDemo2();
        ob.display();
    }
}
