package coding;
import java.util.*;

public class binaryconv {
	
	public int bintodec(int bin)
	{
		int dec=0;
		int units=1;//2^0 
		
		int num=bin;
		
		while(num>0)
		{
			int last=num%10;
			if(last> 1)
			{
				System.out.println("invalid !!!");
				System.exit(0);
			}
			num=num/10;
			
			dec +=last*units;//  1*2^2 + 0*2^1 + 1*2^0
			
			units *=2;// calculate 2 power number 2^0,2^1,2^2....
		}
		
		return dec;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryconv ob =new binaryconv();
		Scanner sc = new Scanner(System.in);
		
		int bin;
		System.out.println("enter the binary digit");
		bin = sc.nextInt();
		
		
		int dec = ob.bintodec(bin);
		System.out.println("decimal form  of "+(bin)+" is "+(dec));
		
		

	}

}
