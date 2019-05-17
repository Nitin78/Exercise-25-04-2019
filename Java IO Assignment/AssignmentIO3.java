import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class AssignmentIO3 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your File Name To Search");
	String s1=sc.nextLine();
 // warning: exception possibilities here
File file = new File(s1);      // it's only an object
 
System.out.println(file.exists()); // check for a real file
System.out.println(file.canRead()); // check for a real file
System.out.println(file.canWrite()); // check for a real file
System.out.println(file.length()); // check for a real file


}
}