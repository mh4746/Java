 

/**
 *
 * @author Root
 */

class Parent{
    
String name = "Abul";
 
  Parent(){
   System.out.print("Constructor");
}
 void method(){
  System.out.println("Parent class");
}

}

class Subclass extends Parent{
      
   Subclass()
{
     super();
}


    void name(){
      super.method();      
}

}

public class SuperKeyword {

    public static void main(String args[]){

        Subclass obj =  new Subclass();

     // obj.name();
}

}
