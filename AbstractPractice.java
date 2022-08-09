   
/*
 *
 * @author Masud
 */

 abstract class A{
   
 abstract void check();

}

class B extends A{
 void check(){  
System.out.println("I am in class B");
}
}

class C extends B{

 void check(){  
System.out.println("I am in class C");
}
}


public class AbstractPractice {
    
     
 public static void main(String args[])
{
     C ob = new C();

     ob.check();

}


}
