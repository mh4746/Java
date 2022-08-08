 

/**
 *
 * @author Masud 
   8/8/2022
 */

class father{
   
 void name(){
   System.out.println("Father class");
}  

}

class mother extends father{

   void name(){
       System.out.print("Mother class");
}

}

public class MethodOveriding {
    

   public static void main(String args[]){

       mother ma = new mother();
       father dady = new father();
       dady.name();
       ma.name();
}

}
