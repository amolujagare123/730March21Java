package pack1;

public class Java1 {

    public int a1;
    public  float f1;
    private char c1;
    public String str1; // data members

    public  void display1() // member function
    {
        System.out.println("a="+a1);
        System.out.println("f="+f1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a1 = 10;
        ob.f1 =4.5f;
        ob.c1 = 'g';
        ob.display1();
    }

}
