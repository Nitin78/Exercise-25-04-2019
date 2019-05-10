//Write a Java program to check whether a given string ends with the contents of another string.
class Assignment13 {

    public static void main(String[] args)
    {
        String str1 = "Nitin Tyagi";
        String str2 = "gi";
        boolean b = str1.endsWith(str2);
        System.out.println(b);
    }
}