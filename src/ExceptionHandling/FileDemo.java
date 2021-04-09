package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {


        /*try {
            FileInputStream fp = new FileInputStream("D:\\MyProg\\amol1.txt");
        }
        catch (Exception e)
        {

        }
*/
        FileInputStream fp = new FileInputStream("D:\\MyProg\\amol1.txt");

        System.out.println("File is read");


    }
}
