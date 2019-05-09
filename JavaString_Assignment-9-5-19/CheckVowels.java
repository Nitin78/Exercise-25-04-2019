import java.util.*;
 
class CheckVowels
{
   public static void main(String args[])
   {
      String a, b= "";
      Scanner in = new Scanner(System.in);
   
      System.out.println("Enter a string to check vowels....");
      a = in.nextLine();
      char[] ch = a.toCharArray();
      int len = ch.length;
 
      for ( int i = 0 ; i <= len-1 ; i++ )
         if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
      System.out.println("vowels");

   }
}