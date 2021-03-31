import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {


    public static void main(String[] args) throws ParseException {

        String dateStr0 = "12-03-2021";

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MM-yyyy");

        Date date0 = sd0.parse(dateStr0);

        System.out.println(date0);

        String dateStr2= "2016 - 06 - 23 | 8:34:23";
        //yyyy - MM - dd | h:mm:ss

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy - MM - dd | h:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);

        String dateStr3= "Thursday 2016/06/23";
        //EEEE yyyy/MM/dd
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date3 = sd3.parse(dateStr3);
        System.out.println(date3);



    }
}
