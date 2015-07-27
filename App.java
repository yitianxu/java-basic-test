package helloworld;

class Machine {	
	
 private String name; 
 private int code; 
  
  public Machine () {  
	  this ("x", 0); 
	  System.out.println("test 1"); 
  }	
  
  public Machine (String x) {
	  
	  System.out.println(x); 
	  
  }
  
  public Machine (String x, int y) {
	  
	  this.name = x; 
	  this.code = y; 
	  
	  System.out.println(name); 
	  System.out.println(code);
  }
}


class Thing {
	public String name; 
	public static String Description; 
	public static int i; 
	public final static int NUM = 10; 
	public int id; 
	
	public Thing () {
		id = i; 
		i ++ ; 
	}
	
	public void showname() {
		 System.out.println(name); 
	}
	
	public static void showInfor () {
		System.out.println("Hello"); 	
		System.out.println(Description); 	
	}
	
}

public class App {
   public static void main(String[] args) {
	  // Machine machine1 = new Machine(); 
	  //  Machine machine3 = new Machine("test3", 3); 
	  //  Machine machine1 = new Machine(); 
	    
	    Thing thing1 = new Thing(); 
	    Thing thing2 = new Thing(); 
	    
	    thing1.name = "Bob"; 
	    thing2.name = "Sue"; 
	    
	    Thing.Description = "I am a thing"; 
	    
	    thing1.showname(); 
	    thing2.showname(); 
	    Thing.showInfor();
	    System.out.println(Thing.i); 
	    System.out.println(Thing.NUM); 
	    System.out.println(thing1.id); 
	    System.out.println(thing2.id); 
	    
	    //System.out.println(thing1.Description); 
	    //System.out.println(thing2.Description); 
	    
	    
	    StringBuilder sb = new StringBuilder (); 
	    
	    sb.append ( "test") ; 
	    sb.append (" is ") ; 
	    sb.append ( " pl "); 
	    
	    System.out.println(sb.toString()); 
	    
   } 
}
