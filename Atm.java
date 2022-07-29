
import java.util.Scanner;
 
class Atm{


    public static void main(String args[])
    {
       
       int balance = 120000, withdraw, deposit;
       
        Scanner sc = new Scanner(System.in);
      
      while(true){
      
      System.out.println("Enter your choosing option");
      System.out.println("Enter 1 for Withdraw money");
      System.out.println("Enter 2 for deposite money");
      System.out.println("Enter 3 for check money");
      System.out.println("Enter 4 for Exit");
       
      int choose = sc.nextInt();

      switch(choose)
      {
       case 1:  
             System.out.println("Enter your amount");
              withdraw = sc.nextInt();
             if(balance>=withdraw )
            {
              balance-=withdraw ;
             System.out.println("Please collect your money");
            }
           else{
                System.out.println("Insufficinet balanced");

              }
 
       break;
       case 2 : System.out.println("Enter amount for deposit");
        deposit= sc.nextInt();
       balance+=deposit;
       System.out.println("Your money has been successfully deposit");
       break;
       case 3 : System.out.println("Your current balance is "+balance);
       break;
       case 4 : System.exit(0);  
       break;
      } 

     }
    
    }

}