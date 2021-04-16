package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveIf1 {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();
        al.add(23);
        al.add(14);
        al.add(33);
        al.add(24);
        al.add(63);

        System.out.println("al="+al);
        // remove elements which are less than 20
        // 1. identify the type of the list
        // 2. consider a varible (no need to specify the type just take variable
        // it will automatically aquire the type)
        // 3. this variable (say 'a' here) will represent each element in the list
        // 4. use predicate symbol (->)
        // 5. write the condition

     //   al.removeIf( a ->    a<20    );

        System.out.println("al="+al);

        // remove all the odd elements

       al.removeIf(a-> a%2 !=0);
       // al.removeIf(a-> a%2 ==1);
        System.out.println("al="+al);



    }
}
