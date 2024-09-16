package coding;
import java.util.*;
public class Teamcoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[3];
		int code=0;
		while(n-- >0)
		{
			int cnt=0;
			for(int i=0;i<3;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]==1)
				{
					cnt++;
				}
			}
			if(cnt>=2)
			{
				code++;
			}
		}
		System.out.println(code);
	}

}
