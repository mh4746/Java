// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Animal{
    void eat()
    {
        System.out.println("Eating....");
    }
}
class Dog extends Animal{
    
      void eat()
      {
          System.out.println("Meat");
      }
}

class Cat extends Dog{
    
      void eat()
      {
          System.out.println("Catfood");
      }
    
}
class MultilevelRuntimePolymorphism {
    public static void main(String[] args) {
        Animal a1,a2,a3;
        a1 = new Dog();
        a2 = new Cat();
        a3 = new Animal();
       a1.eat();
       a2.eat();
       a3.eat();
      
    }
}
