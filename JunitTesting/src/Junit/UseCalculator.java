package Junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UseCalculator {

@BeforeEach
	public void setUp() {
		System.out.println("Hello");
	}
	@Test
	public void add() {
		int a=3,b=6;
		int sum=a+b;
		assertEquals(9,sum);
		
		
	}
	@Test
	public void disp(){
		boolean flag=true;
		int value=7;
		if(value!=0) {
			flag=true;
		}
		assertTrue(flag);
		
		
	}

	
}


