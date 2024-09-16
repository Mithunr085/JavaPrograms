package coding;
import java.util.*;
public class Sortndelete {
	
	public void sortAndDelete(int n,int a[],int elem)
	{
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1] >a[j])
				{
					temp =a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!= elem)
			{
				System.out.println(a[i]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("invalid input");
			System.exit(0);
		}
		int a[]= new int[n+1];
		for(int i=0;i<=n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("invalid input");
				System.exit(0);
			}
		}
		Sortndelete sd = new Sortndelete();
		sd.sortAndDelete(n,a,a[n]);
		

	}

}
