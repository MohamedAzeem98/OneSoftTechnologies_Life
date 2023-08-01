package JunitTesting;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class HelloWorld987 {
    int a=7,b=9;
	@BeforeEach
	public void display() {
		System.out.println("Hello here u go......>>>>");
	}
	@Test
	public void display123() {
		int pro=a*b;
		if(pro!=0) {
			assertEquals(pro,63);
		}
	}
	
	@Test
	public void displayingerr() {
		int x=45;
		boolean flag=false;
		if(x!=0) {
			assertFalse(flag);
		}
	}
	@Test
	public void showing() {
		int s=2,r=8;
		assertEquals(s,2);
	}
	@AfterEach
	public void show() {
		System.out.println("Done r u there .....<<<<<");
	}
}
