import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6,5,2,8,1,7,6,3,1,8,9,6,5);
		
		//Stream -> Collection of values
		Stream<Integer> stream1 = nums.stream();
		Stream<Integer> stream2 = stream1.filter(n -> n%2!=0);
		Stream<Integer> stream3 = stream2.map(n -> n*2);
		int result = stream3.reduce(0,(c,e) -> c+e);
	
		
		
		//stream3.forEach(n-> System.out.println(n));
		System.out.println(result);
		//stream1.forEach(n-> System.out.println(n)); // throws exception. stream can;t be reusable.
		
		
	}

}
