
/*Create a method that can accept an array of String objects and sort in
alphabetical order. The elements in the left half should be completely in uppercase and the
elements in the right half should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in
UPPPERCASE*/
import java.util.Scanner;
import java.util.Arrays;
public class JavaEx6
{
final static int ARRAY_ELEMENTS = 3;
public static void main(String[] args)
{
String str = "StackOverflow";
char[] ch = str.toCharArray();
System.out.println("Enter the names: ");
System.out.println("**********************");
Arrays.sort(ch);
for (int i=0;i<ch.length ;i++ )
{
System.out.println("Name are " + ch[i]);
}
}
}