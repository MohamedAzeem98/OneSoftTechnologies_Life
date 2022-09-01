import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Dating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SimpleDateFormat dm=new SimpleDateFormat("dd/MM/yyyy"+" "+"HH:mm:ss z");
		
		Date d=new Date();
		
		
		dm.setTimeZone(TimeZone.getTimeZone("IST"));
		
		System.out.println(dm.format(d));

	}

}
