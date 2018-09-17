
import java.text.SimpleDateFormat;
import java.util.Date;


public class NewClass1 {
    public static void main(String[] args) {
        
        
        
        Date d1 = new Date();
        System.out.println(d1);
        
        SimpleDateFormat sdf = new SimpleDateFormat("a dd, LLL hh:mm:ss");
        System.out.println(sdf.format(d1));
        
    }
    
}
