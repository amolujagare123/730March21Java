package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveIf3 {

    public static void main(String[] args) {

        ArrayList<Character> al  = new ArrayList<>();

        al.add('a');//
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');//
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');//
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');//

        System.out.println("al="+al);
        // 1. identify the type of the list
        // 2. consider a varible (no need to specify the type just take variable
        // it will automatically aquire the type)
        // 3. this variable (say 'a' here) will represent each element in the list
        // 4. use predicate symbol (->)
        // 5. write the condition
       //  remove all the vowels --> a,e ,i,o,u

        al.removeIf(ch -> (ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') );

        System.out.println("al="+al);



    }
}
