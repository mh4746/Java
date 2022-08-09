 

/**
 *
 * @author Masud
 */

interface Outer{
    
   void show();     

   interface Inner{
   void msg();
}

}

class Calling implements Outer.Inner{
   
    public void show(){
   System.out.println("Show work");
 }

public void msg(){
   System.out.println("Wlcome to message method");
}

}

public class NestedInterface {
    
public static void main(String args[]){

   Outer.Inner  ob = new Calling();// upcasting
  
   ob.msg();
}
}
