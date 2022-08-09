

 
/**
 *
 * @author  Masud
 */
package mypackage;

public class Mypackage {
     
    void show()

{

System.out.println("mypackage");
}
    
}




package mypackage;

/**
 *
 * @author Masud
 */
public class PracticePackage {
    
    public static void main(String args[]){
       
         Mypackage ob = new Mypackage();
          ob.show();
  }
}


