import java.util.*;
class TrafficLight
{
	void color()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Choice.");
		System.out.print("1:Yellow\n2:Red\n3:Green\n");
	    int c=sc.nextInt();
	    switch(c)
	    {
	    	case 1:System.out.println("Ready");
	    	       break;
	    	case 2:System.out.println("Stop");
	    	       break;	    	
	    	case 3:System.out.println("Move");	   
	     	       break;
	    	default:System.out.println("Wrong Input..");
	    }
	}
	public static void main(String[] args) {
		TrafficLight tl=new TrafficLight();
		tl.color();
	}
}