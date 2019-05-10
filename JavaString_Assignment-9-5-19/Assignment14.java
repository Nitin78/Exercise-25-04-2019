//Write a Java program to replace all the 'r' characters with 't' characters in a string.
class Assignment14 {

    public static void main(String[] args)
    {
        String str1 = "how are you today and yesterday how going on.";
        String str2 = str1.replace("r","t");
        System.out.println(str1+"   After Replace is:   "+str2);
    }
}