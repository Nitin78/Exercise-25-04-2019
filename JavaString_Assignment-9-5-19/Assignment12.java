//Write a Java program to test if a given string contains the specified sequence of char values.
import java.util.*;
class Assignment12 {

    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter First String");
        String str2 = sc.nextLine();
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
}
