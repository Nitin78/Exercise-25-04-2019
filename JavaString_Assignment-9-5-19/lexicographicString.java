//Write a java program to compare two strings lexicographically, ignoring case differences. 
class lexicographicString{
public static void main(String[] args)
    {
        String str1 = "This is Nitin Tyagi";
        String str2 = "This is Nitin Tyagi";
        int result = str1.compareToIgnoreCase(str2);
        if (result != 0)
        {
            System.out.println("String are Not Equal...");
        }
        else
        {
            System.out.println("Both String are Equal");
        }
        
    }
}