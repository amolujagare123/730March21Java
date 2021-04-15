package WrapperClassDemos;

public class Conversions1 {

    public static void main(String[] args) {


        String s1 = "11";
      // to convert string into integer
       int i1 =  Integer.parseInt(s1);

        String s2 = "21";
        int i2 = Integer.parseInt(s2);
        System.out.println(s1+s2);

        System.out.println(i1+i2);

        String s3 = "23.6";
        String s4 = "23.6";

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);

        System.out.println(d1+d2);

        String s5 = "1.2f";
        String s6 = "1.3f";

        float f1 = Float.parseFloat(s5);
        float f2 = Float.parseFloat(s6);
        System.out.println(f1+f2);

        String s7 = "false";

        boolean b = Boolean.parseBoolean(s7);

        if(b)
            System.out.println("true");
        else
            System.out.println("false");


        String s8 = "d";
        // Charater.parseChar() --> method doesnot exist
        char ch ;

    }

}
