package ExceptionHandling;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 23;
            a[1] = 13;
            a[2] = 24;
            a[3] = 33;
            a[4] = 25;
            a[5] = 53;
        }
        catch (Exception e)
        {
            System.out.println("Inside try block");
        }


        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("End of the program");
    }
}
