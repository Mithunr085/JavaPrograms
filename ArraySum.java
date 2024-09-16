package coding;

import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		/*int sum=0;
		for(int num : numbers) 
		{
			sum=sum+num;
		}
		System.out.println(sum);
		*/
//		int sum=numbers.stream().reduce(0,(a,b)->a+b);
//		System.out.println(sum);
		
		int sum=numbers.parallelStream().reduce(0,(a,b)->a+b);
		System.out.println(sum);

	}

}
