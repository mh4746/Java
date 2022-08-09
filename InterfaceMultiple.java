 
/**
 *
 * @author Masud
 */

 interface Showable{
     
   void show();      

}
interface Printable{

    void Print();

}
class Obj implements Showable,Printable{
    
    public void show(){
   System.out.println("Show");
}

public void print(){
   System.out.println("Print");
}

}

public class InterfaceMultiple {
    
  public static void main(String args[])
{

     Obj ob = new Obj();
     ob.show();
    ob.print();

}

}
