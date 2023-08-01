
import java.time.LocalDate;
import java.time.LocalTime;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class LogProgram2 {
	
	static Logger log=Logger.getLogger(LogProgram2.class.getName());

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		
		String str=null;
		
		try {
			int ei=str.charAt(2);
		}catch(Exception ex) {
			//System.out.println(ex.getMessage());
			log.error(date);
			log.error(time);
			log.error(ex+ex.getMessage());
			
			
		}
		
	}

}
