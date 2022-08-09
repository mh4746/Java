 

/**
 *
 * @author Masud
 */

interface Print{
   void printf();
}

interface Hello extends Print{
   void hello();
}

class Object implements Hello{


  public void printf(){
    System.out.println("Printf");
}
  public  void hello(){
   System.out.println("Hello");
}
}


public class InterfaceExtends {
    
  public static void main(String args[])
{
     
      Object ob = new Object();
      ob.hello();
     ob.printf();

}

}
