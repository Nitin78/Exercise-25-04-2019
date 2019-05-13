import com.cg.eis.exception.*;
import java.util.*;
public class SalaryValidation
{
	void validateSalary() throws OwnException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Salary: ");
		int salary=sc.nextInt();
		if(salary<3000)
		{
         throw new OwnException("This is My error Message");
		}
		else
		System.out.println("Permission Granted !!\n\t Proceed Further");
}
	   
	public static void main(String[] args)  {
     SalaryValidation cn=new SalaryValidation();
     try{
     cn.validateSalary();
        }
        catch(OwnException e)
        {
        	System.out.println(e);
        }

	}
}