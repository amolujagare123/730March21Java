package ExceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12-04-2021";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        sd.parse(dateStr);
    }
}
