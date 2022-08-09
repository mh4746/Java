 

/**
 *
 * @author Masud
 */

interface Drawable{
    void a();
    void b();
    void c();
    
}

 class  Circle implements Drawable{

  public void a()
{
  System.out.println("I am in class Circle");
}

}

class Rectangle extends Circle implements Drawable{
         
  public void a()
{
  System.out.println("I am in class Rectangle");
}


}


public class Interface {
    
  public static void main(String args[]){
     
    Circle ob = new Circle();

    //ob.a();

 Circle ob3 = new Circle();

   ob3.a();
}



}
