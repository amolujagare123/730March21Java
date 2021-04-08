package pack1;



public class Java2 extends Java1{

    int a2;
    float f2;
    char c2;
    String str2; // data members

    void display2() // member function
    {
        System.out.println("a="+a2);
        System.out.println("f="+f2);
        System.out.println("c="+c2);
        System.out.println("str="+str2);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a1 =10;
        ob.f1 =4.5f;
       // ob.c1 ='c';
        ob.display1();

        Java2 j2 = new Java2();
        j2.a1 = 10;
        j2.f1= 2.3f; // members of Java1



    }


    }
