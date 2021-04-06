package Methods;

import pack2.Java4;

public class ReturningValue {


    int getMyData()
    {
        int x =98;

        return  x;
      // return  10;
    }

    String getMyString()
    {
        String s = "my string";

        return  s;
    }

    Java4 getMyObject()
    {
        Java4 j4 = new Java4();

        j4.a4 = 10;
        j4.f4 =1.2f;
        j4.c4 ='f';
        j4.str4 ="amol";

        return  j4;
    }

    int[] getMyArray()
    {
        int[] a = {23,54,12,45,78};

        return  a;
    }

    String[][] getMyTwoDArray()
    {
        String[][] str = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"}
        };

        return str;
    }


    public static void main(String[] args) {


        int number = 78;
        System.out.println(number);
        int y  = number;

        ReturningValue ob = new ReturningValue();
        ob.getMyData(); // it holds the value that it returns

        System.out.println(ob.getMyData());
        int ab = ob.getMyData();
        System.out.println("ab="+ab);

        System.out.println(ob.getMyString());
        String ss = ob.getMyString();
        System.out.println("ss="+ss);

        Java4 obj4 = ob.getMyObject();
        obj4.display4();


       int[] xx = ob.getMyArray();

       for(int i=0; i<xx.length ;i++)
           System.out.println(xx[i]);


       String[][] s = ob.getMyTwoDArray();

       for (int i=0;i<s.length;i++)
       {
           for (int j=0;j<s[0].length;j++)
           {
               System.out.print(s[i][j]+" ");
           }
           System.out.println();
       }

        System.out.println(s[0][1]);
    }
}
