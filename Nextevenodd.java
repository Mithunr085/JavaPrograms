package coding;
import java.util.*;

public class Nextevenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Number too Small");
			System.exit(0);
		}
		else if(n>32767)
		{
			System.out.println("Number too big");
			System.exit(0);
		}
		int num = n,last=0,result=0,cnt=1;
		while(num > 0)
		{
			last = num%10;
			last+=2;
			num/=10;
			result=result+last*cnt;
			cnt*=10;
		}
		System.out.println(result);

	}
}
