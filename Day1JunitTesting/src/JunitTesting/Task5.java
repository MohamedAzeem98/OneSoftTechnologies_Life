package JunitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Test;

public class Task5 {
	
	@Test
	
	public void flow() {
		String s1=new String("Hii");
		String s2=new String("Hii");
		assertEquals(s1,s2);
	}
	
	@Test
	
	public void showAndDisplay() {
	assertSame("hello","hello");
	}

	
	
	
	
	
	
	
	
}
