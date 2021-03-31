package ClassesAndConstructors;

public class MyClassWithConst {
    int a;
    float f;
    char c;
    String str; // data members

    MyClassWithConst()
    {
        a =10 ;
        f = 3.4f;
        c ='g';
        str="amol";
    }


    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("f="+f);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassWithConst ob  =new MyClassWithConst();

        ob.display();


        MyClassWithConst ob2  =new MyClassWithConst();
        ob2.display();
    }

}
