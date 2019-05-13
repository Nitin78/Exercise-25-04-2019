class MyOwnException  extends Exception{  
 MyOwnException(String s){  
 
 }  
} 

class myException{  
  
   static void check(int age)throws MyOwnException{  
     if(age<15)  
      throw new MyOwnException("not valid");  
     else  
      System.out.println("welcome .. Age is Valid");  
   }  
     
   public static void main(String args[]){  
      try{  
      check(18);  
      }catch(Exception m)
      {
      	System.out.println("Age is not valid: "+m);
      }  
  
  }  
} 