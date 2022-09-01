import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SampleProgramFor {

	
	static Logger log=Logger.getLogger(SampleProgramFor.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		/*log.info("Hii");
		log.warn("Old is Gold");
		log.fatal("Hiii");
		log.debug("Awesome");
		log.error("LogInSuccessFully");
		*/
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			log.error(d);
			log.error(t);
			log.error(e+e.getMessage());
			
			
		}
		
		/*Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yy"+" "+"HH:mm:SS z");
		s.setTimeZone(TimeZone.getTimeZone("IST"));
		
		System.out.println(s.format(d));
		*/
		
	}

}
