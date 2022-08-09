 

/**
 *
 * @author Masud
 */

interface Rate{

  float getInterestRateOf();
}

class IFIC implements Rate{

    public float getInterestRateOf(){
   return 6.7f;
 }
}

class DucthBangla implements Rate{
 public float getInterestRateOf(){
   return 8.9f;
 }
}

class Sonali implements Rate{
 public float getInterestRateOf(){
   return 5.5f;
 }
}

public class InterfaceBankExample {
    
  public static void main(String arsg[])
{

    Rate ob = new Sonali();
  System.out.println(ob.getInterestRateOf());

   Rate ob1 = new DucthBangla();
  System.out.println(ob1.getInterestRateOf());

Rate ob2 = new IFIC();
  System.out.println(ob2.getInterestRateOf());

}
}
