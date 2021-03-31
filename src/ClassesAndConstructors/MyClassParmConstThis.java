package ClassesAndConstructors;

public class MyClassParmConstThis {
    int a;
    float f;
    char c;
    String str; // data members

    MyClassParmConstThis(int a, float f , char c , String str)
    {
        this.a =  a;
        this.f = f;
        this.c = c;
        this.str = str;
    }


    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("f="+f);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassParmConstThis ob  =new MyClassParmConstThis(23,4.5f,'d',"abcd");

        ob.display();


    }

}
