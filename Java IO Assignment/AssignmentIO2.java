import java.io.*;
class AssignmentIO2 {
public static void main(String [] args) {
char[] in = new char[100]; // to store input
int size = 0;
int i = 0;
try {
FileWriter file = new FileWriter("anotherFile.txt");

 
BufferedWriter fw = new BufferedWriter(file); // create an actual file
// & a FileWriter obj
fw.write("Hello\n"); // write characters to
fw.write("How\n"); // write characters to
fw.write("Are\n"); // write characters to
fw.write("You"); // write characters to

//fw.append("HI I am Nitin Tyagi ..");
// the file
fw.flush(); // flush before closing
fw.close(); // close file when done
 

FileReader file1=new FileReader("anotherFile.txt"); //Again this is just an object 
BufferedReader br = new BufferedReader(file1);

StringBuilder sb = new StringBuilder("");
 String line=""; 
        String str = "";
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          //StringBuilder sb = new StringBuilder("");
        while((line = br.readLine()) != null) 
        { 
        	i++;
                      

                  System.out.println("Contents from file are : "+i+":" + line);
            
        } 
          

  } catch(IOException e) {System.out.println("Can't read from the file currently..."); }
 }

}
