import java.util.*;
 
class ReverseString
{
   public static void main(String args[])
   {
      String a, b= "";
      Scanner in = new Scanner(System.in);
 
      System.out.print("Enter a string to reverse   ");
      a = in.nextLine();
 
      int len = a.length();
 
      for ( int i = len - 1 ; i >= 0 ; i-- )
         b = b + a.charAt(i);
 
      System.out.println("Reverse of entered string is: "+b);
   }
}