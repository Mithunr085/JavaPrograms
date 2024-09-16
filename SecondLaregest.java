package coding;
import java.util.*;
public class SecondLaregest {
	
	public void secondLargest(int a[],int n)
	{
		int largest=a[0],secondlarge=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>largest)
				largest=a[i];
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>secondlarge && a[i]!=largest)
				secondlarge=a[i];
		}
		System.out.println(secondlarge);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("invalid............");
			System.exit(0);
		}
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("invalid............");
				System.exit(0);				
			}
				
		}
		SecondLaregest sl = new SecondLaregest();
		sl.secondLargest(a,n);
		
	}

}
