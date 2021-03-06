public class StringComparison {
    public static void main(String[] args) {
        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "xyz";
        String str5 = "PQR";
        String str6 = new String("amol");

        int a =10 ;
        int b =20;
        System.out.println(a==b);

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// false
        System.out.println(str1.equalsIgnoreCase(str3));// true
        System.out.println(str1.equals(str4));// false
        System.out.println(str1.equals(str6)); // true

        System.out.println(str1==str2); // true
        System.out.println(str1==str6); // true

    }
}
