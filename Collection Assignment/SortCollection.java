import java.util.*;
class EmployeeDetail{
    private Integer age,uid;
    private String name,address;
    EmployeeDetail(int uid, int age,String name,String address){
    this.uid=uid;
    this.age=age;
    this.name=name;
    this.address=address;
    }

    public void setID(int uid)
    {
        this.uid=uid;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public Integer getID()
    {
        return this.uid;
    }
    public Integer getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public String getFname()
    {  
     return this.name.split(" ")[0];  
    }
    public String getLname()
    {  
        String[] tokens = this.name.split(" ");
       
        return tokens[tokens.length -1]; 
    }
    public String getAddress()
    {
        return this.address;
    }

@Override
public String toString()
{
    return "Employee Details:\n ID:"+this.getID()+"Age:"+this.getAge()+"First Name:"+this.getFname()+"Last Name:"+this.getLname()+"Address:"+this.getAddress();
}

}

class SortCollection{
        ArrayList list=new ArrayList();
        Scanner sc=new Scanner(System.in);
     void addItem()
     {      
        System.out.print("Enter Employee Details:\n");      
        System.out.print("ID:");        
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Name :");
        String name=sc.nextLine();
        System.out.print("Age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Address:");       
        String address=sc.nextLine();
        list.add(new EmployeeDetail(id,age,name,address));
    }
    
   void sortByAge()
   {
    java.util.Collections.sort(list, new SortByAge());
    System.out.println("Sorted List is :\n"+list);
    
   }
   void sortByID()
   {
    java.util.Collections.sort(list, new SortById());
    System.out.println("Sorted List is :\n"+list);
    
   }
   void sortByFName()
   {
    java.util.Collections.sort(list, new SortByFname());
    System.out.println("Sorted List is :\n"+list);
    
   }
   void sortByLName()
   {
    java.util.Collections.sort(list, new SortByLname());
    System.out.println("Sorted List is :\n"+list);
    
   }

public static void main(String[] args) {
SortCollection li=new SortCollection();
String choice="y";
Scanner sc1=new Scanner(System.in);
           do{
            li.addItem();
            System.out.print("ADD MORE (Y/N):");
            choice=sc1.next();
          }while(choice.equalsIgnoreCase("Y"));
          System.out.println("Enter The Number:  \n"+"Press 1. For Sort By Age \n"+"Press 2. For Sort By Id\n"+"Press 3. For Sort By First Name\n"+"Press 4. For Sort By Last Name\n");
          int ch=sc1.nextInt();
switch(ch){
    case 1:
li.sortByAge();
break;
case 2:
li.sortByID();
break;
case 3:
li.sortByFName();
break;
case 4:
li.sortByLName();
break;
default:System.out.println("Enter Wrong Choice..");
}
}
}
class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getAge().compareTo(((EmployeeDetail)secondObject).getAge()); 
    }
}
class SortById implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getID().compareTo(((EmployeeDetail)secondObject).getID()); 
    }
}
class SortByFname implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getFname().compareTo(((EmployeeDetail)secondObject).getFname()); 
    }
}
class SortByLname implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
return ((EmployeeDetail)firstObject).getLname().compareTo(((EmployeeDetail)secondObject).getLname()); 
    }
}