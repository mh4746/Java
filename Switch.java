class Switch{
   
   public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    

    public static void main(String args[])
   {
   
     Day[] day = Day.values();

      for(Day i : day)
     {

      switch(i)
      {
       case Sun: System.out.println("Sun");
       break;
       case Mon : System.out.println("Mon");
       break;
       default : System.out.println("Default");  
      } 

     }


}




}