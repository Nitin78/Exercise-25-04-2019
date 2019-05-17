import java.io.*;
class AssignmentIO4{

void read()
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter the word u want to replace:");
	String fw=sc.next();
	System.out.println("replaced word:");
	String rw=sc.next();
	File f=new File("Myfile.txt");
    try
    {
      StringBuilder sb = new StringBuilder();
      BufferedReader br = new BufferedReader(new FileReader(f));
      String ln;
      while((ln = br.readLine()) != null)
        {
            sb.append(ln.replace(fw,rw)).append("\n");
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(sb.toString());
        bw.close();
        System.out.println("TEXT Replaced Successfully !!!!!!");
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
	
}


	public static void main(String[] args) {
		ReplaceWord rp=new ReplaceWord();
		rp.read();
	

	} }