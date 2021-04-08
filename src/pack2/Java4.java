package pack2;

import StaticNFinal.StaticMethods;

import static StaticNFinal.StaticMethods.myMethod2;
import static StaticNFinal.StaticMethods.staticMethod2;

//import static StaticNFinal.StaticMethods.*;

public class Java4 {

    public  int a4;
    public  float f4;
    public  char c4;
    public  String str4; // data members

    public  void display4() // member function
    {
        System.out.println("a="+a4);
        System.out.println("f="+f4);
        System.out.println("c="+c4);
        System.out.println("str="+str4);
    }

    public static void main(String[] args) {

        StaticMethods ob = new StaticMethods();
        myMethod2(); // static method called using object

        myMethod2();

        staticMethod2();

        System.out.println("");

    }


    }
