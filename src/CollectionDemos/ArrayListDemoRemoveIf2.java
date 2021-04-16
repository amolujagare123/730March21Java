package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<String> al  = new ArrayList<>();

        al.add("amol"); // 0
        al.add("sunny"); //1
        al.add("Sonali");// 2
        al.add("Akshay"); //  3
        al.add("Praful"); // 4
        al.add("abhijit");  // 5
        al.add("ritesh");  // 6

        System.out.println("al="+al);
        // 1. identify the type of the list
        // 2. consider a varible (no need to specify the type just take variable
        // it will automatically aquire the type)
        // 3. this variable (say 'a' here) will represent each element in the list
        // 4. use predicate symbol (->)
        // 5. write the condition

     //  remove the strings which ends with 'l'

        al.removeIf(str ->  str.endsWith("l"));

        System.out.println("al="+al);


    }
}
