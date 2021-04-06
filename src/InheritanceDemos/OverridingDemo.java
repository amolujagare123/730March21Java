package InheritanceDemos;

public class OverridingDemo {

    int a;
    int b;

    void add()
    {
      int c = 0;
      c= a+b;
      System.out.println("c="+c);
    }

    void add(int x,int y) // Method overloading
    {
        int c = 0;
        c= x+y;
        System.out.println("c="+c);
    }

    void add(double x,double y) // Method overloading
    {
        double c = 0;
        c= x+y;
        System.out.println("c="+c);
    }

    void add(String x,String y) // Method overloading
    {
        String c = "";
        c= x+y;
        System.out.println("c="+c);
    }


    public static void main(String[] args) {
        OverridingDemo ob = new OverridingDemo();

        ob.add();
        ob.add(12,12);
        ob.add(1.7,1.5);
        ob.add("amol","Java");

        ob.add(23,1.2); // 23.0


    }
}
