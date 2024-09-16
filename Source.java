package coding;
import java.util.*;
public class Source {

	public int getSecondSmallest(int a[])
	{
		int smallest=a[0],secondSmall=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<secondSmall && a[i]!=smallest)
			{
				secondSmall=a[i];
			}
		}
		return secondSmall;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of elements in array :");
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Source s = new Source();
		int secondSmall= s.getSecondSmallest(a);
		System.out.println(secondSmall);


	}

}
