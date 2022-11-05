import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6,5,2,8,1,7,6,3,1,8,9,6,5);
		
//Intermediate and termination functions.
//Intermediate func are filter,map,... and termination func are reduce,...
		int result = nums.parallelStream()
				.filter(n -> n%2==1)
				.map(n -> n*2)
				.reduce(0,(c,e)->c+e);
		
		System.out.println(result);
		
	}

}