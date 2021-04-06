package Methods;

import pack2.Java4;

public class MethodsArguments {

    int a;
    double d;

    void getData()// no arguments
    {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
    }

    void printData(int x) // x - is argument / parameter
    {
        System.out.println("x=" + x);
    }

    void printAnotherData(int x, double d, String s) {
        System.out.println("x=" + x);

        System.out.println("d=" + d);

        System.out.println("s=" + s);
    }

    void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    void printTwoDArray(String[][] stArr) {
        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void getMyObject(Java4 j)
    {
        j.display4();
    }


    public static void main(String[] args) {

        MethodsArguments ob = new MethodsArguments();
       /* ob.getData();
        ob.printData(10);
        ob.printAnotherData(12,3.4,"amol");*/

        int[] x = {2,4,12,543,67,89};

        ob.printArray(x);

        String[][] str = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"}
        };

        ob.printTwoDArray(str);

        Java4 j4 = new Java4();

        j4.a4 = 10;
        j4.f4 =1.2f;
        j4.c4 ='f';
        j4.str4 ="amol";

        ob.getMyObject(j4);

    }


}
