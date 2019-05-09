/*import java.util.*;
class StringPalindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a = sc.nextLine();
		String b=a.toLowerCase();
		String c= new StringBuffer(b).reverse().toString();
		if(b.equals(c)){
	System.out.println("Palindrome");
	}
	else{
	System.out.println("Not Palindrome");
	}	
}
}*/



import java.util.*;
class StringPalindrome
{
   public static void main(String args[])
   {
      String a, b= "";
      Scanner in = new Scanner(System.in);
 
      System.out.print("Enter a string to Check ");
      a = in.nextLine();
 	  String c=a.toLowerCase();
      int len = a.length();
 
      for ( int i = len - 1 ; i >= 0 ; i-- )
        b = b + c.charAt(i);
     if(c.equals(b))
    {
     	System.out.println("Palindrome");	
    }
    else{
    	System.out.println("Not Palindrome");	
    }
 
      
   }
}
