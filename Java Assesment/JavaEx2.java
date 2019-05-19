import java.util.Scanner;
public class JavaEx2 { 
    static boolean check(String s) { 
        int n = s.length(); 
  
        for (int i = 1; i < n; i++) { 
            if (s.charAt(i) < s.charAt(i - 1)) { 
                return false; 
            } 
        } 
  
        return true; 
    } 
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String s =sc.nextLine();
           
        if (check(s)) { 
            System.out.println("Yes Alphabetical Order.."); 
        } else { 
            System.out.println("No Not Alphabetical order.."); 
        } 
    } 
} 