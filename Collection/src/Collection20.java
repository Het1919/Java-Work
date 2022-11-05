import java.util.*;
public class Collection20 {
	public static void main(String[] args)
	{
		List<Integer> nums = Arrays.asList(7,3,9,2);
		
		Collections.sort(nums,(n1,n2) -> n1-n2);
		
		System.out.println(nums);
	}
}
