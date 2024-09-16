package coding;

import java.util.Scanner;

public class MissingNUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n =sc.nextInt();
		long a[]= new long[(int) n];
		long CalculatedSum=0,ActualSum=0,result;
		for(int i=1;i<n;i++)
		{
			a[i]=sc.nextInt();
			CalculatedSum+=a[i];
		}
		ActualSum= n*(n+1)/2;
		result = ActualSum - CalculatedSum;
		System.out.println(result);
	}

}
