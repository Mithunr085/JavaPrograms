package coding;
import java.util.*;
 
public class KeysValues {
	int elem,cnt=0;// cnt is used as index for found array
	int found[]= new int[100];// used to store the key of the particular searched element
	
	public KeysValues(int elem)
	{
		this.elem=elem;
	}
	
	public void searchKeys(int arr[],int n)
	{
		
		int i=1;// odd index to get the values from array
		while(i<n)
		{
			if(arr[i] == elem)
			{
				found[cnt++]=arr[i-1];// i-1 is even index to get the key from array
			}
			i+=2;// increment by 2 because we are interested in key index 
		}
		if(cnt>0)// atleast one key found
		{
			System.out.println("The keys found are : ");
			for(i=0;i<cnt;i++)
			{
				System.out.println(found[i]);
			}
		}
		else// no particular key for the value in array
		{
			System.out.println("Key NOT FOUND");
		}
		
	}
	
	public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements :");
			int n= sc.nextInt();
			if(n<0 || n%2!=0)
			{
				System.out.println("invalid.......");
				System.exit(0);
			}
			int arr[]= new int[n];
			System.out.println("enter the key and values : ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]<0)
				{
					System.out.println("invalid.......");
					System.exit(0);
				}
			}
			System.out.println("enter the element to be searched :");
			  int element  = sc.nextInt();
			 
			 KeysValues kv =new KeysValues(element);
			 kv.searchKeys(arr,n);
	}

}
