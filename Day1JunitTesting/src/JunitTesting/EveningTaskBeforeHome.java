package JunitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EveningTaskBeforeHome {


	
	public int findMax(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		return max;
	}
	
	@Test
	
	public void hereBy() {
		
		int arr[]= {1,4,17,9,3,5,7,-9};
		
		assertEquals(17,findMax(arr));
	}
	
	
	
	
	
	
	
	
	
	
}
