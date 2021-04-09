package ExceptionHandling;

public class NumberDemoThrow {

    void checkNumber(int a) throws Exception {

        if(a>=1 && a<=10)
            System.out.println("We are safe");
        else
            throw new Exception("We are in danger");
    }

    public static void main(String[] args) throws Exception {

        NumberDemoThrow ob = new NumberDemoThrow();

        int x =12;

        ob.checkNumber(x);

        System.out.println("end of the program");
    }
}
