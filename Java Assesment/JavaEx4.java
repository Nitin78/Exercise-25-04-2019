import java.util.*;
class JavaEx4
{
    public static void main(String[] args) {
        
        String s1 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check!...");
        s1 = sc.nextLine();
        int len = s1.length();
        String pattern = "[A-Z,a-z]{8}_[job]+";   
            if(s1.matches(pattern))
                System.out.println("Right Pattern!..");
            else
                System.out.println("Wrong Pattern!..");    
    }
}