import java.util.Arrays;
import java.util.List;

public class Xyza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
		// Implementation of Stream.max()
		// to get the maximum element
		// of the Stream according to the
		
				// Creating a list of integers
				List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

				System.out.print("The maximum value is : ");

				// Using stream.max() to get maximum
				// element according to provided Comparator
				// and storing in variable var
				Integer var = list.stream().max(Integer::compare).get();

				System.out.print(var);
			}
		}

	
	
	
	
	
	
	
	
	
	
	
