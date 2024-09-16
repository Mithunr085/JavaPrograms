package coding;
import java.util.*;
public class Product1and3large {

	public int findFirstLargest(int n,int a[])
	{
		int largest=a[0],secondlarge=a[0],thirdlarge=a[0];
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
		for(int i=0;i<n;i++)
		{
			if(a[i]>thirdlarge && a[i]<secondlarge )
				thirdlarge=a[i];
		}
		return largest*thirdlarge;
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
		Product1and3large pr = new Product1and3large();
		int product= pr.findFirstLargest(n,a);
		System.out.println(product);

	}

}
