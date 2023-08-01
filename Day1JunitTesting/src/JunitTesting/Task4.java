package JunitTesting;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Task4 {

	Task4 annt;
@BeforeEach	
	public void beforeTest() {
		annt=new Task4();
	}

public String getCapital(String country) {
	Map<String,String>getWorld=new HashMap<>();
	
	getWorld.put("India","Delhi");
	getWorld.put("China","Beijing");
	getWorld.put("Usa","NewYork");
	
	return getWorld.get(country);
}
@Test
public void testIndia() {
	String india=annt.getCapital("India");
	assertNotNull(india);
 }

@Test
public void testChina() {
	String china=annt.getCapital("China");
	assertNotNull(china,"Hello I'm China");
}
@Test
public void testUsa() {
	String usa=annt.getCapital("Usa");
	assertNotNull(usa);
  }

String k="Hello";
String l=null;
@Test

public void sh() {
	assertNotNull(k);
}

@Test
public void sh2() {
	assertNull(l);
}

String f="Dont know Anything";
@Test
public void fh() {
	assertNotNull(f);
}


}

