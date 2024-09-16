package coding;
import java.util.*;

public class PrimeSum {

    public void sumPrime(int arr[],int n)
    {
        int sum=0;// to store sum of prime numbers present in array
        
        for(int i=0;i<n;i++)
        {
            int num =arr[i];//copy of array element
            if(num == 0 || num==1)// ignore if the num is 0 or 1 
                continue;
            else
            {
                boolean isPrime = true;
                for(int j=2;j<=num/2;j++)// to check the prime number 
                {
                    if(num % j == 0 && num!=j)// if num is divisible by j completely & if num is not j then its not prime number
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                {
                    sum+=num;// summing up the prime numbers 
                }
            }   
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        PrimeSum ps = new PrimeSum();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();// array index
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ps.sumPrime(arr,n);
    }

}