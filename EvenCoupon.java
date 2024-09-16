package coding;
import java.util.*;
public class EvenCoupon {

	public int generateCode(int coupon)
	{
		int num=coupon,last,code=0,cnt=1;
		while(num>0)
		{
			last=num%10;
			if(last%2==0)
			{
				code=last*cnt+code;// to calculate code
				cnt*=10;//to maintain the tenth's place 
			}
			num/=10;
		}
		return code;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coupon=sc.nextInt();
		if(coupon <0)
		{
			System.out.println("Number too small.....");
			System.exit(0);
		}
		else if(coupon>32767)
		{
			System.out.println("Number too big.....");
			System.exit(0);
		}
		else
		{
			EvenCoupon ec = new EvenCoupon();
			int code = ec.generateCode(coupon);
			System.out.println(code);
		}
	}

}
