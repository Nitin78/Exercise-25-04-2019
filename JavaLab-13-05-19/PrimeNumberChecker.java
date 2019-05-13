import java.util.*;
class PrimeNumberChecker
{
	public static void main(String[] args) {
		int n,p;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to Check all prime Numbers:  ");
		n=sc.nextInt();
		System.out.print("Prime Numbers: ");
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.print(i+",");
		}

	}
}