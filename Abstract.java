
 abstract class Abs{
   
        int id;
        abstract void set();
}

class Subclass extends Abs{
    
       void set(){
          System.out.println("Abstract calling.....");
       }
}

class Abstract{
    
    public static void main(String[] args) {
        
         Subclass ob = new  Subclass();
         
          ob.set();
        
    }
}
