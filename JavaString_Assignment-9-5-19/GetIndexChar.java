  class GetIndexChar { 
  
    public static char
    getc(String str, int index) 
    { 
        return str.charAt(index); 
    } 
  
    public static void main(String[] args) 
    { 
  
        String str = "NitinKumarTyagi"; 
        int index = 5; 
        char ch = getc(str, index); 
  
        System.out.println(ch); 
    } 
}