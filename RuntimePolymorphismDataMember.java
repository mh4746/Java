class Price{
    
       int p = 10;
}

class Food extends Price{
    
           int p = 90;
}

class RuntimePolymorphismDataMember {
    
    public static void main(String[] args) {
        Price ob = new Food();
        System.out.println(ob.p);
    }
}
