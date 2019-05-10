//8. Create a program that reads an unspecified number of integer arguments from the command line and adds them together. For example, suppose that you enter the following:

class Assignment8
{
public static void main(String[] args) {
	int sum=0;
	   if(args.length==1)
			{
				System.out.println("Enter atlest two numbers....");
				
			}
			else
			{
		for(int i=0;i<args.length;i++)
		{

			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("Sum is "+sum);
	}
	}	
}