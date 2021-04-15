package ClassesAndConstructors;

public class MyClassParmConst {
    int a;
    float f;
    char c;
    String str; // data members

    MyClassParmConst(int x, float ff , char ch , String s)
    {
        a = x ;
        f = ff;
        c = ch;
        str = s;
    }

    void display() // member function
    {

        System.out.println("a="+a);
        System.out.println("f="+f);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassParmConst ob  =new MyClassParmConst(23,4.5f,'d',"abcd");

        ob.display();


    }

}
