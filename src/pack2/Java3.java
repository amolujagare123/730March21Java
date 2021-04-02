package pack2;


import pack1.Java1;

public class Java3 extends Java1{

    int a3;
    float f3;
    char c3;
    String str3; // data members

    void display3() // member function
    {
        System.out.println("a="+a3);
        System.out.println("f="+f3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a1 =78;
        ob.str1 = "str";
       // ob.f1 =4.5f;
        ob.display1();

        Java3 j3 = new Java3();
        j3.a1 =10;
        j3.str1 ="";
        j3.display3();

    }


    }
