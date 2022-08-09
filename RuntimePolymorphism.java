 

/**
 *
 * @author Masud
   09/08/2022
 */
class Bank{

   float getRateOfInterest()
{
   return 0.20f;
}

}
class Brack extends Bank{

   float getRateOfInterest()
{
    return 8.9f;
}

}
public class RuntimePolymorphism {
    
   public static void main(String args[])
{
       
      Bank b = new Brack();// upcasting
       
    System.out.println(b.getRateOfInterest());

}

}
