package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Task3 {
	
	
	public void showCase() {
		System.out.println("I am coming");
	}

	static boolean a=false;
	@Test
	public void verify() {
		Assertions.assertFalse(a);
	}
	
	
	int age=9;
	@Test
	public void show() {
		if(age>18) {
			Assertions.assertTrue(true);
		}else {
			Assertions.assertFalse(false);
		}
	}
	
	int num=17;
	boolean flag=true;
	@Test
	
	public void showDisplay() {
		int a=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				a++;
			}
		}
		if(a==0) {
			Assertions.assertTrue(true);
		}
	}
	
}
