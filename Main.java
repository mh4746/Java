  
class Test{
    
     Test()
     {
         System.out.println("Test Constructor\n");
     }
     
     {
         System.out.println("System class in\n");
     }
}

class Parent extends Test{
    String name;
    Parent()
    {   
    
         System.out.println(name);
    }
    
    {
         System.out.println("Calling......\n");
    }
    
    {
        name = "Momin";
    }
    
}

class HelloWorld {
    public static void main(String[] args) {
       new Parent();
    }
}
