import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex47 {
    public static void main(String[] args) {
        SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");         //formato de data
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT-3")));            //hora de brasilia
        
        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));               //data e hora atual
    }
}
