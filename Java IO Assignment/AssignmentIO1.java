import java.io.*;
class AssignmentIO1 {
public static void main(String [] args) {
char[] in = new char[100]; // to store input
int size = 0;
try {
FileWriter file = new FileWriter("anotherFile.txt");
FileReader file1=new FileReader("anotherFile.txt"); //Again this is just an object
 
BufferedWriter fw = new BufferedWriter(file); // create an actual file
// & a FileWriter obj
fw.write("Hello\n"); // write characters to
fw.write("How\n"); // write characters to
fw.write("Are"); // write characters to
fw.write("You"); // write characters to

//fw.append("HI I am Nitin Tyagi ..");
// the file
fw.flush(); // flush before closing
fw.close(); // close file when done
 
StringBuilder sb = new StringBuilder("");
 
BufferedReader br = new BufferedReader(file1);
 String line=""; 
        String str = "";
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          //StringBuilder sb = new StringBuilder("");
        while((line = br.readLine()) != null) 
        { 
            sb.append(line);
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                String[] wordList = line.split("\\s+"); 
                  countWord += wordList.length; 
                String[] sentenceList = line.split("[.]+"); 
                  sentenceCount += sentenceList.length; 
                 
            } 
            
        } 
          
        System.out.println("word :" + countWord); 
        System.out.println("Lines : " + sentenceCount); 
        System.out.println("Characters : " + characterCount); 

  } catch(IOException e) {System.out.println("Can't read from the file currently..."); }
 }
}

