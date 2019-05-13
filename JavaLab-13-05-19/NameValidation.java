class MyOwnException  extends Exception{  
 MyOwnException(String s){  
 
 }  
} 

class MyException{  
  
   static void check(String FirstName , String LastName)throws MyOwnException{  
     if(FirstName.equals("") || LastName.equals(""))  
      throw new MyOwnException("");  
     else  
      System.out.println("Welcome  :  "+FirstName+" "+LastName);  
   }  
     
   public static void main(String args[]){  
      try{  
      check("Nitin" , "Tyagi");  
      }catch(Exception m)
      {
      	System.out.println("Please Enter Your Name Properly... "+m);
      }  
  
  }  
} 