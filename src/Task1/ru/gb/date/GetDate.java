package Task1.ru.gb.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
    Date dateNow = new Date();

    SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");


    @Override
    public String toString() {
        return formatForDateNow.format(dateNow) + " -> ";
    }
}
