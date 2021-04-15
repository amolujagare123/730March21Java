package WrapperClassDemos;

public class DatatypeDemos {

    public static void main(String[] args) {

        int i =5; // premetive data type
        System.out.println("i="+i);

        // non premitive or wrapper pass
        Integer ii = new Integer(i); // ----> boxing or wrapping
        System.out.println("ii="+ii);

        Integer ii1 = i;
        Integer ii2 = 10; // autoboxing / auto wrapping

        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);


        Integer aa = new Integer(8);
        int a1 = aa.intValue(); // unboxing / unwrapping
        int a2 = aa; // auto unboxing / auto unwrapping
        System.out.println("aa="+aa);
        System.out.println("a1="+a1);
        System.out.println("a2="+a2);

        Character cc = new Character('c');

        Double dd = new Double(23.5);







    }
}
