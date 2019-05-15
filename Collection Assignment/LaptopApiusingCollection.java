import java.util.*;
class Laptop{
    private Integer ramSize,hddSize,uid;
    private String brand;
    Laptop(int uid, int ramSize,int hddSize,String brand){
    this.uid=uid;
    this.ramSize=ramSize;
    this.hddSize=hddSize;
    this.brand=brand;
    }

    public void setID(int uid)
    {
        this.uid=uid;
    }
    public void setRamSize(int ramSize)
    {
        this.ramSize=ramSize;
    }
    
    public void setHddSize(int hddSize)
    {
        this.hddSize=hddSize;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public Integer getID()
    {
        return this.uid;
    }
    public Integer getRamSize()
    {
        return this.ramSize;
    }
    public Integer getHddSize()
    {
        return this.hddSize;
    }
    
    public String getBrand()
    {
        return this.brand;
    }

@Override
public String toString()
{
    return "Laptop Details:\nID:"+this.getID()+"RAM SIZE:"+this.getRamSize()+"HDD SIZE:"+this.getHddSize()+"BRAND:"+this.getBrand();
}

}
class APICollectionDemo{
        ArrayList list=new ArrayList();
        Scanner sc=new Scanner(System.in);
     void addItem()
     {
        list.add(new Laptop(1,2,500,"Dell"));
        list.add(new Laptop(2,4,800,"Apple"));
        list.add(new Laptop(3,8,1000,"Lenovo"));
        System.out.println("How Much Details You Want to Add...");
        int n = sc.nextInt();
        for(int v=0;v<n;v++)
        {
        System.out.println("Enter the Unique Id..");
        int id=sc.nextInt();
        System.out.println("Enter the Ram Size..");
        int a1=sc.nextInt();
        System.out.println("Enter the HDD Size..");
        int a2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Brand Name..");
        String s1=sc.nextLine();
        list.add(new Laptop(id,a1,a2,s1));
    }
}
    void view()
    {
        for(Object ob : list)
            System.out.println(ob);
    }
    void delete()
    {
        System.out.println("Enter Id To Delete Data..");
       int nd=sc.nextInt();
        for (Object o : list) {
            list.remove(list.indexOf(o));
            break; 
    }
}

    public static void main(String[] args) {
        APICollectionDemo li=new APICollectionDemo();
        li.addItem();
        li.delete();
        li.view();
    }
}