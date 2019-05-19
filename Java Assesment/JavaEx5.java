import java.util.*;

class JavaEx5 {
public static void main(String args[]){
    int n1=0;
    System.out.println("Enter a Number...");
    Scanner sc = new Scanner(System.in);
    n1= sc.nextInt();

    int number = n1;
    int sum = 0; 

    while(number>0){
        int n2= number%10;
        System.out.println("Cube of "+n2 +" is "+(n2*n2*n2));
        sum = sum+1;
        number = number/10;

    }
}
}