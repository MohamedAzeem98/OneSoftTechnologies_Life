package JunitTesting;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GrandFinale1 {

	@BeforeClass            //setUpBeforeClass
	
	public void setUpBefore()throws Exception{
		System.out.println("Before class");
	}
	
	@Before
	
	public void setUpBefore1() throws Exception{
		System.out.println("Before Each");
	}
	
	@Test
	
	public void addTwo() {
		int a=9,b=6;
		int result1=a+b;
		assertEquals(15,result1);
	}
	
    @Test
	
	public void crossCheck() {
    	boolean result2=true;
    	if(result2==true)
		assertTrue(result2);
	}
	
	@Test
	
	public void verify() {
		String str=null;
		assertNull(str);
	}
	
	@After
	
	public void display() {
		System.out.println("Done");
	}
	
	@AfterClass                   //tearDownClass
	
	public void lastShow() {
		System.out.println("After Class");
	}
	
}
