package coding;
import java.util.*;
public class avgpasskey {
	
	float oddsum=0,evensum=0,avg=0;
	public float avgoddevensum(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i] %2 ==0)
			{
				evensum +=a[i];
			}
			else
			{
				oddsum +=a[i];
			}
		}
		avg= (evensum + oddsum)/2;
		
		return avg;
	}

	public static void main(String[] args) 
	{
	
		avgpasskey obj =new avgpasskey();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the total plot numbers");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("invalid input!!!");
			System.exit(0);
		}
		
		
		int a[]= new int[n];
		System.out.println("enter the plots");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i] < 0)
			{
				System.out.println("invalid input!!!");
				System.exit(0);
			}
		}
		
		
		float result=obj.avgoddevensum(a,n);
		System.out.println(result);

	}

}
