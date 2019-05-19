import java.util.*;
 class JavaEx1 {
    public static void main(String args[]) {
        int n, sum = 0;
        StringTokenizer st = new StringTokenizer("2 5 3", " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("Sum is :" + sum);
       
    }
}