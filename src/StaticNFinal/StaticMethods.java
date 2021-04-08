package StaticNFinal;

public class StaticMethods {

    int a;
   static double d;

   void myMethod1() // non static method
   {
       System.out.println("myMethod1");
       d = 10; // static member - allowed
       System.out.println("d="+d);
       a =10 ; // non static member - allowed

       staticMethod2(); // static method - allowed
       myMethod1(); // non static method - allowed
   }

    public static void staticMethod2()
   {
       System.out.println("staticMethod2()");
   }

    public static void myMethod2() //  static method
    {
        System.out.println("myMethod1");
        d = 10; // static member - allowed
        System.out.println("d="+d);
       // a =10 ; // non static member - not allowed

        staticMethod2(); // static method - allowed
     //   myMethod1(); // non static method - not allowed
    }

    public static void main(String[] args) {

        StaticMethods ob = new StaticMethods();
        ob.myMethod2(); // static method called using object

        StaticMethods.myMethod2();
        // static method called using class name


    }

}
