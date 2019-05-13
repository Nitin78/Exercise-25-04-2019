import java.util.*;
class anagramcheck
{
    public static void main(String[] input)
    {
        String str1, str2;
        int l, l1, l2, i, j, k1=0, k2=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();
        
        l1 = str1.length();
        l2 = str2.length();
		
        if(l1 == l2)
        {
            l = l1;
            for(i=0; i<l; i++)
            {
                k1 = 0;
                for(j=0; j<l; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        k1 = 1;
                        break;
                    }
                }
                if(k1 == 0)
                {
                    k2 = 1;
                    break;
                }
            }
            if(k2 == 1)
            {
                System.out.print("Strings are not Anagram");
            }
            else
            {
                System.out.print("Strings are Anagram");
            }
        }
    }
}